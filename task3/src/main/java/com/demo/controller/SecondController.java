package com.demo.controller;

import com.demo.pojo.NavbarSecond;
import com.demo.service.NavbarSecondService;
import com.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondController {
    @Autowired
    NavbarSecondService navbarSecondService;
    @Autowired
    ResponseData responseData ;

    @ResponseBody
    @RequestMapping(value = "/task/second/{id}", method = RequestMethod.GET)
    public ResponseData selectById(@PathVariable("id") Integer id) {

        NavbarSecond navbarSecond = navbarSecondService.selectByPrimaryKey(id);
        if (null == navbarSecond) {
            responseData.setCode(200);
            responseData.setMessage("找不到该二级导航");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(navbarSecond);
        }
        return  responseData;
    }

}
