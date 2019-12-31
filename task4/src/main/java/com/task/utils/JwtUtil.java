package com.task.utils;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private String key="jnshu";

    private DesUtil desUtil;

    {
        try {
            desUtil = new DesUtil();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setKey(String key) {
        this.key = key;
    }

    //生成jwt
    public String generateToken(String username, long expiry) throws Exception {
        //指定签名的时候使用的签名算法，也就是header那部分，jjwt已经将这部分内容封装好了。
        io.jsonwebtoken.SignatureAlgorithm signatureAlgorithm = io.jsonwebtoken.SignatureAlgorithm.HS256;
        //生成jwt的时间
        Long now = System.currentTimeMillis();
        Date generateTime = new Date(now);
        logger.info("generateTime:"+generateTime);
        //创建payload的私有声明（根据特定的业务需要添加，如果要拿这个做验证，一般是需要和jwt的接收方提前沟通好验证方式的）
        Map<String, Object> claims = new HashMap<>();
//        logger.info("username:" + username);
        username = desUtil.encrypt(username);
        claims.put("username", username);
        claims.put("generateTime", desUtil.encrypt(generateTime.toString()));
        //这里其实就是new一个JwtBuilder，设置jwt的body
        JwtBuilder jwtBuilder = Jwts.builder()
                //如果有私有声明，一定要先设置这个自己创建的私有的声明，这个是给builder的claim赋值，一旦写在标准的声明赋值之后，就是覆盖了那些标准的声明的
                .setClaims(claims)
                //签发时间
                .setIssuedAt(generateTime)
                .signWith(signatureAlgorithm, key);
        if (expiry > 0) {
            //过期时间
            Date expiryTime = new Date(now + expiry);
            logger.info("有效期"+expiryTime);
            jwtBuilder.setExpiration(expiryTime);
        }
        return jwtBuilder.compact();
    }

    public Map<String, Object> parseToken(String token) throws Exception {
        Map<String, Object> result = new HashMap<>();
        if (token != null) {
            // 解析token
            try {
                Map<String, Object> body = Jwts.parser()
                        .setSigningKey(key)
                        .parseClaimsJws(token)
                        .getBody();
                String username = (String) body.get("username");
                String generateTime = (String) body.get("generateTime");

                if (username == null || username.isEmpty()) {
                    result.put("ERR_MSG", "您还没有登录，请登录：");
                    return result;
                }
                result.put("username", desUtil.decrypt(username));
                result.put("generateTime", desUtil.decrypt(generateTime));
//                logger.info("登录时间："+desUtil.decrypt(generateTime));
                return result;
            } catch (SignatureException | MalformedJwtException e) {
                // jwt 解析错误
                result.put("ERR_MSG", "系统错误，请尝试重新登录：");
                return result;
            } catch (ExpiredJwtException e) {
                // jwt 已经过期，在设置jwt的时候如果设置了过期时间，这里会自动判断jwt是否已经过期，如果过期则会抛出这个异常，我们可以抓住这个异常并作相关处理。
                result.put("ERR_MSG", "登录信息已过期，请登录：");
                return result;
            }
        } else {
            result.put("ERR_MSG", "没有您的身份信息，请登录：");
            return result;
        }
    }
}