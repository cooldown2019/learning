package com.task.controller;

import com.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Controller
public class RegisterController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/toRegister", method = RequestMethod.GET)
    public String toRegister() {
        return "toRegister";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String insert(HttpServletRequest httpServletRequest, Model model) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        if (username != null
                && password != null
                && username.length() > 0
                && password.length() > 0) {
            int row = userService.insertByUser(username, password);
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
