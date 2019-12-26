package com.demo.controller;


import com.demo.pojo.Visitor;
import com.demo.service.VisitorService;
import com.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VisitorController {

    @Autowired
    ResponseData responseData;
    @Autowired
    VisitorService visitorService;


    @RequestMapping(value = "/task/visit",method = RequestMethod.GET)
    @ResponseBody
    public ResponseData visit() {
        Visitor visitor = visitorService.insertName();
        if (null == visitor.getVisitorName()) {
            responseData.setCode(500);
            responseData.setMessage("服务异常");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(visitor);
        }
    return responseData;
    }

}
