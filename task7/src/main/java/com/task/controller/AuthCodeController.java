package com.task.controller;

import com.task.apitool.MailTool;
import com.task.apitool.SmsTool;
import com.task.cache.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class AuthCodeController {
    @Autowired
    RedisUtils redisUtils;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    SmsTool smsTool = new SmsTool();
    MailTool mailTool = new MailTool();

    /**
     * 发送手机验证码
     */
    @ResponseBody
    @RequestMapping(value = "/phone", method = RequestMethod.POST, produces = "text/xml;charset=UTF-8")
    public String phoneCode(String phone) {
        if (null != phone) {

            String code = smsTool.smsCode();

            logger.info("注册的手机号:" + phone);
            logger.info("验证码：" + code);

            String data = smsTool.sendSms(phone, code);
            redisUtils.set(phone, code, 600 * 1000);
            System.out.println(phone + "-" + code);
            System.out.println(redisUtils.get(phone));
            return data;
        }
        return "手机号错误，请重新输入";
    }

    /**
     * 发送邮箱验证码
     */
    @ResponseBody
    @RequestMapping(value = "/email", method = RequestMethod.POST, produces = "text/xml;charset=UTF-8")
    public String emailCode(String email) throws IOException {
        String code = mailTool.code();

        logger.info("使用邮箱注册：" + email);
        logger.info("验证码：" + code);
        try {
            mailTool.send(email, code);
            redisUtils.set(email, code, 600 * 1000);
            System.out.println(email + code);
            return "发送成功";
        } catch (Exception e) {
            return "系统错误，稍后再试";
        }
    }
}
