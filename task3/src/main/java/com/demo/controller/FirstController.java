package com.demo.controller;

import com.demo.pojo.NavbarFirst;
import com.demo.pojo.NavbarSecond;
import com.demo.service.NavbarFirstService;
import com.demo.service.NavbarSecondService;
import com.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class FirstController {
    @Autowired
    NavbarFirstService navbarFirstService;
    @Autowired
    NavbarSecondService navbarSecondService;
    @Autowired
    ResponseData responseData ;

    @RequestMapping(value = "task/first",method = RequestMethod.GET)
    @ResponseBody
    public ResponseData getFirst(){

        List<NavbarFirst> list = navbarFirstService.listFirst();
        if (null == list) {
            responseData.setCode(200);
            responseData.setMessage("找不到一级导航列表");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(list);
        }
        return responseData;
    }
    @RequestMapping(value = "task/first/{firstid}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseData getFirstById(@PathVariable("firstid") Integer firstid){

        List<NavbarSecond> list = navbarSecondService.selectByFirstId(firstid);
        if (null == list) {
            responseData.setCode(200);
            responseData.setMessage("找不到一级导航列表");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(list);
        }
        return responseData;
    }

}
