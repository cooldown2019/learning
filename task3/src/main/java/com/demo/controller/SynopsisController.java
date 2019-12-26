package com.demo.controller;

import com.demo.pojo.Synopsis;
import com.demo.service.SynopsisService;
import com.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SynopsisController {
    @Autowired
    SynopsisService synopsisService;
    @Autowired
    ResponseData responseData ;

    @RequestMapping(value = "/task/synopsis", method = RequestMethod.GET)
    @ResponseBody
        public ResponseData listSynopsis() {
        ResponseData responseData = new ResponseData<>();
        List list = synopsisService.listSynopsis();
        if (null == list) {
            responseData.setCode(500);
            responseData.setMessage("找不到简介列表");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(list);
        }
        return responseData;
    }


    @RequestMapping(value = "/task/synopsis/{synopsisid}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData selectSynopsis(@PathVariable("synopsisid")   Integer synopsisid) {
        ResponseData responseData = new ResponseData<>();

        Synopsis synopses = synopsisService.selectByPrimaryKey(synopsisid);
        if (null == synopses) {
            responseData.setCode(200);
            responseData.setMessage("找不到改简介");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(synopses);
        }
        return responseData;
    }
}
