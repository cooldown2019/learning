package com.controller;


import com.pojo.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/restful")
public class RestfulController {
    @Autowired
    StudentService studentService;


    //查询所有，return 所有
    @ResponseBody
    @RequestMapping(value = "/student/list", method = RequestMethod.GET)
    public List<Student> listAll() {
        List<Student> students = studentService.queryAllStudent();
        return students;
    }

    //根据id查询
    @ResponseBody
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ResponseEntity<Student> queryById(@PathVariable("id") long id) {
        try{
            Student student =this.studentService.queryById(id);
            if(null == student){
                //404
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            //200
            return  ResponseEntity.ok(student);
        }catch(Exception e){
            e.printStackTrace();

        }
        //500错误
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    /**
     * 新增用户
     *
     */
    @ResponseBody
    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public ResponseEntity<Void> saveUser(Student student) {
        try {
            this.studentService.addStudent(student);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    /**
     * 更新用户资源
     *
     *
     */
    @ResponseBody
    @RequestMapping(value = "/student",method = RequestMethod.PUT)
    public ResponseEntity<Void> updateUser(Student student) {
        try {

            this.studentService.updateStudent(student);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    /**
     * 删除用户资源
     *
     *
     */
    @ResponseBody
    @RequestMapping(value = "/student/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser( @PathVariable("id") long id) {
        try {
            if (id == 0) {
                // 请求参数有误
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            this.studentService.deleteStudentById(id);
            // 204
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

}
