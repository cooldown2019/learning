package com.controller;


import com.pojo.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/allStudent")
    public String list(Model model) {
        List<Student> list = studentService.queryAllStudent();
        model.addAttribute("list", list);
        return "allStudent";
    }

    @RequestMapping(value="toAddStudent")
    public String toAddStudent() {
        return "addStudent";
    }

    @RequestMapping(value="/addStudent")
    public ModelAndView addStudent(@Validated  Student student, BindingResult br,ModelAndView mv) {

        if(br.hasErrors()){
            FieldError idmsg = br.getFieldError("id");
            FieldError namemsg = br.getFieldError("name");

            if(idmsg != null) mv.addObject("idmsg", idmsg.getDefaultMessage());
            if(namemsg != null) mv.addObject("namemsg", namemsg.getDefaultMessage());

            mv.setViewName("addStudent");
            return mv;
             }

        studentService.addStudent(student);
        mv.setViewName("allStudent");
        return mv ;

    }

    @RequestMapping(value="/del/{studentId}")
    public String deleteStudent(@PathVariable("studentId") Long id) {


        studentService.deleteStudentById(id);

        return "redirect:/student/allStudent";

    }

    @RequestMapping(value="toUpdateStudent")
    public String toUpdateStudent(Model model, Long id) {
        model.addAttribute("student", studentService.queryById(id));
        return "updateStudent";
    }


    @RequestMapping(value="/updateStudent")
    public String updatePaper(Model model, Student student) {
        studentService.updateStudent(student);
        student = studentService.queryById(student.getId());
        model.addAttribute("paper", student);
        return "redirect:/student/allStudent";
    }

}


