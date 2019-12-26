package com.demo.controller;

import com.demo.pojo.Guestbook;
import com.demo.service.GuestbookService;
import com.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GuestbookController {
    @Autowired
    GuestbookService guestbookService;
    @Autowired
    ResponseData responseData ;

    @ResponseBody
    @RequestMapping(value = "/task/guestbook/{worksid}", method = RequestMethod.GET)
    public ResponseData getGuestBook(@PathVariable("worksid") Integer worksid) {

        List list = guestbookService.selectByWorksId(worksid);
        if (null == list) {
            responseData.setCode(200);
            responseData.setMessage("该作品评论为空");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("请求成功");
            responseData.setData(list);
        }
        return responseData;
    }

    @ResponseBody
    @RequestMapping(value = "/task/guestbook/", method = RequestMethod.POST)
    public ResponseData getGuestBook(Guestbook guestbook) {
        ResponseData responseData = new ResponseData<>();
        int result = guestbookService.insertSelective(guestbook);
        if (0 == result) {
            responseData.setCode(200);
            responseData.setMessage("评论失败");
            responseData.setData(null);
        } else {
            responseData.setCode(200);
            responseData.setMessage("评论成功");
            responseData.setData(null);
        }
        return responseData;
    }
}
