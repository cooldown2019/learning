package com.task.controller;

import com.task.cache.RedisUtils;
import com.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @Autowired
    RedisUtils redisUtils;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/toRegister", method = RequestMethod.GET)
    public String toRegister() {
        return "toRegister";
    }

    @RequestMapping(value = "/toEmailRegister", method = RequestMethod.GET)
    public String toEmailRegister() {
        return "toEmailRegister";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String insert(HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        String phone = httpServletRequest.getParameter("phone");
        String code = httpServletRequest.getParameter("code");
        //验证码要转化成json对象的string类型（阿里云sms验证码格式  "{\"code\":\"1234\"}" ）
        String smsCode = "{\"code\":\"" + code + "\"}";

        boolean bool = smsCode.equals(redisUtils.get(phone));

        if (username != null && username.length() > 0
                && password != null && password.length() > 0
                && phone != null && phone.length() > 0
                && code != null && code.length() > 0 &&
                bool == true) {

            int row = userService.insertByPhone(username, password, phone);
            if (row > 0) {
                return "home";
            } else {

                return "toRegister";
            }
        } else {
            return "toRegister";
        }
    }

    @RequestMapping(value = "/emailRegister", method = RequestMethod.POST)
    public String insert1(HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        String email = httpServletRequest.getParameter("email");
        String code = httpServletRequest.getParameter("code");

        boolean bool = code.equals(redisUtils.get(email));
        if (username != null && username.length() > 0
                && password != null && password.length() > 0
                && email != null && email.length() > 0
                && code != null && code.length() > 0
                && bool == true) {

            int row = userService.insertByEmail(username, password, email);

            if (row > 0) {
                return "home";
            } else {

                return "toRegister";
            }
        } else {
            return "toRegister";
        }
    }

}
