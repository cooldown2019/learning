package com.task.controller;

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
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginOutController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    JwtUtil jwtUtil = new JwtUtil();
    @Autowired
    UserService userService;
    //注销*登出
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        String token = jwtUtil.generateToken("", 0);
        Cookie cookie = new Cookie("token", token);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
//        Cookie cookieSid = new Cookie("JSESSIONID", session.getId());
//        cookieSid.setMaxAge(0);
//        response.addCookie(cookieSid);
        mav.setViewName("redirect:/home");
        logger.info("注销成功");
        return mav;
    }
}
