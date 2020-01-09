package com.task.service.impl;

import com.task.dao.StudentDAO;
import com.task.po.Student;

import com.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    public List<Student> show() {
        return studentDAO.show();
    }

    @Override
    public Integer countByWorking() {
        return studentDAO.countByWorking();
    }

    @Override
    public Integer countByLearning() {
        return studentDAO.countByLearning();
    }
}
