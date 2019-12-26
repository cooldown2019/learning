package com.demo.controller;

import com.demo.pojo.Works;
import com.demo.service.WorksService;
import com.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

import java.util.Map;

@Controller
public class WorksController {
    @Autowired
    WorksService worksService;
    @Autowired
    ResponseData responseData ;

    @RequestMapping(value = "task/works/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData selectWorks(@PathVariable("id") Integer id) {

        Works works = worksService.selectByPrimaryKey(id);
        if (null == works) {
            responseData.setCode(200);
            responseData.setMessage("没有id为" + id + "的作品");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(works);
        }
        return responseData;
    }

    //查询作品和评论
    @RequestMapping(value = "task/worksall/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData selectWorksAll(@PathVariable("id") Integer id) {

        Map works = worksService.selectAll(id);
        if (null == works) {
            responseData.setCode(200);
            responseData.setMessage("没有id为" + id + "的作品");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(works);
        }
        return responseData;
    }


    @RequestMapping(value = "task/search", method = RequestMethod.GET )
    @ResponseBody
    public ResponseData searchWorks(String name  ) throws UnsupportedEncodingException {

        ResponseData responseData = new ResponseData<>();
        Works works = worksService.selectByName(name);
        System.out.println(name);
        if (null == works) {
            responseData.setCode(200);
            responseData.setMessage("没有name 为" + name + "的作品");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(works);
        }
        return responseData;
    }

}
