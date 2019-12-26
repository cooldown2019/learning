package com.demo.controller;


import com.demo.pojo.Banner;
import com.demo.service.BannerService;
import com.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BannerController {
    @Autowired
    BannerService bannerService;
    @Autowired
    ResponseData responseData ;

    @RequestMapping(value = "task/banner/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData selectBanner(@PathVariable("id") Integer id) {

        Banner banner = bannerService.selectByPrimaryKey(id);
        if (null == banner) {
            responseData.setCode(200);
            responseData.setMessage("没有id为" + id + "的轮播图");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(banner);
        }
        return responseData;
    }

}
