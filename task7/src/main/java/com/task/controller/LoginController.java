package com.task.controller;

import com.task.po.User;
import com.task.service.UserService;
import com.task.utils.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    JwtUtil jwtUtil = new JwtUtil();
    @Autowired
    UserService userService;

    //跳转到登录页
    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "toLogin";
    }

    //提交登录信息
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(ModelAndView mav, HttpServletRequest httpServletRequest, HttpServletResponse response, HttpSession session) throws Exception {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        //如果能查出来数据,说明数据库里存在这条数据,那么登录成功,跳转首页；否则登录失败,留在登录页面
        User user = userService.selectByUser(username, password);
        if (null != user && null != user.getId()) {
            logger.info("登陆成功" + ",用户名:" + user.getUsername());
            String token = jwtUtil.generateToken(user.getUsername(), 1000 * 60 * 60 * 24 * 7);
            Cookie cookie = new Cookie("token", token);
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);
            Cookie cookieSid = new Cookie("JSESSIONID", session.getId());
            cookieSid.setMaxAge(60*24*1000);
            response.addCookie(cookieSid);
            logger.info("cookie:" + cookie.toString());
            mav.addObject("username",user.getUsername());
            mav.addObject("picture",user.getPicture());
            mav.setViewName("home");
        } else {
            mav.setViewName("redirect:/toLogin");
        }
        return mav;
    }


}
