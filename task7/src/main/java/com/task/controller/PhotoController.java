package com.task.controller;

import com.task.apitool.OssTool;
import com.task.service.UserService;
import com.task.utils.DesUtil;
import com.task.utils.JwtUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class PhotoController {
    private static Logger logger = Logger.getLogger(String.valueOf(PhotoController.class));
    @Autowired
    OssTool ossTool;
    @Autowired
    DesUtil desUtil;
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "toPhoto", method = RequestMethod.GET, produces = "text/html; charset=utf-8")

    public ModelAndView toPhoto(HttpServletRequest request, MultipartFile upload) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("toPhoto");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/u/upload", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
    public ModelAndView upload(ModelAndView modelAndView , HttpServletRequest request, MultipartFile upload, HttpServletResponse response) throws Exception {
        // 将文件名存入域中
        String name = upload.getOriginalFilename();
        /*将MultipartFile转为File*/
        String path = request.getSession().getServletContext().getRealPath("/uploads/" + name);
        File file = new File(path);
        FileUtils.copyInputStreamToFile(upload.getInputStream(), file);
        /*上传文件*/
        String folderfile = ossTool.uploadImg(file);
        String url1=ossTool.getUrl(folderfile);


        //解析token
        String token = null;
        for (Cookie cookie : request.getCookies()) {
            if (cookie.getName().equals("token")) {
                token = cookie.getValue();
            }
        }
        JwtUtil jwtUtil = new JwtUtil();
        Map<String, Object> map = jwtUtil.parseToken(token);
        String username = (String) map.get("username");
        String message = (String) map.get("ERR_MSG");
        System.out.println("token值"+username+message);

        if (message != null && username == null) {
            request.setAttribute("msg", message);
            request.getRequestDispatcher("/toLogin").forward(request, response);
        } else {
            int row = userService.insertUrlByUsername(username, url1);

            if (row<=0){
                modelAndView.setViewName("toLogin");
                return modelAndView;
            }
        }
        /*删除本地文件*/
        file.delete();
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
