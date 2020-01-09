package com.task.controller;

import com.task.po.Student;
import com.task.service.StudentService;
import com.task.service.impl.MemcachedService;
import com.task.service.impl.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class JsonController {
    @Qualifier("RedisService")
    @Autowired
    RedisService redisService;

    @Qualifier("MemcachedService")
    @Autowired
    MemcachedService memcachedService;
    @Qualifier("StudentService")
    @Autowired
    StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public Map<String, Object> showJson() {
        //展示优秀学员
        List<Student> studentList = studentService.show();
        //返回在学人数
        Integer count = studentService.countByLearning();
        //返回已经工作人数
        Integer number = studentService.countByWorking();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("studentList", studentList);
        hashMap.put("count", count);
        hashMap.put("number", number);
        return hashMap;
    }

    @ResponseBody
    @RequestMapping(value = "/json1", method = RequestMethod.GET)
    public Map<String, Object> showJson1() {
        //展示优秀学员
        List<Student> studentList = redisService.show();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("studentList", studentList);
        return hashMap;
    }

    @ResponseBody
    @RequestMapping(value = "/json2", method = RequestMethod.GET)
    public Map<String, Object> showJson2() {
        //展示优秀学员
        List<Student> studentList = memcachedService.show();
        //返回在学人数
        Integer count = memcachedService.countByLearning();
        //返回已经工作人数
        Integer number = memcachedService.countByWorking();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("studentList", studentList);
        hashMap.put("count", count);
        hashMap.put("number", number);
        return hashMap;
    }
}
