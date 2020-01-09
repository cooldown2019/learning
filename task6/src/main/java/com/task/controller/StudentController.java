package com.task.controller;


import com.task.po.Student;
import com.task.service.StudentService;
import com.task.service.impl.MemcachedService;
import com.task.service.impl.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class StudentController {

    @Qualifier("StudentService")
    @Autowired
    StudentService studentService;

    @Qualifier("RedisService")
    @Autowired
    RedisService redisService;

    @Qualifier("MemcachedService")
    @Autowired
    MemcachedService memcachedService;


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showJsp(Model model) {
        //展示优秀学员
        List<Student> studentList = studentService.show();

        model.addAttribute("studentList", studentList);

        return "home";
    }

    @RequestMapping(value = "/jsp1", method = RequestMethod.GET)
    public String showJsp1(Model model) {
        //展示优秀学员
        List<Student> studentList = redisService.show();
        //返回在学人数
        Integer count = redisService.countByLearning();
        //返回已经工作人数
        Integer number = redisService.countByWorking();
        model.addAttribute("studentList", studentList);
        model.addAttribute("count", count);
        model.addAttribute("number", number);

        return "home";
    }

    @RequestMapping(value = "/jsp2", method = RequestMethod.GET)
    public String showJsp2(Model model) {
        //展示优秀学员
        List<Student> studentList = memcachedService.show();
        //返回在学人数
        Integer count = memcachedService.countByLearning();
        //返回已经工作人数
        Integer number = memcachedService.countByWorking();
        model.addAttribute("studentList", studentList);
        model.addAttribute("count", count);
        model.addAttribute("number", number);

        return "home";
    }

}
