package com.task.controller;


import com.task.po.Student;
import com.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String show(Model model) {
        //展示优秀学员
        List<Student> studentList = studentService.show();
        //返回在学人数
        Integer count = studentService.countByLearning();
        //返回已经工作人数
        Integer number = studentService.countByWorking();
        model.addAttribute("studentList", studentList);
        model.addAttribute("count", count);
        model.addAttribute("number", number);

        return "home";
    }



}
