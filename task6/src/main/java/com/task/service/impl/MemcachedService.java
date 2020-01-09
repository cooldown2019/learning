package com.task.service.impl;

import com.task.cache.MemcachedUtils;
import com.task.dao.StudentDAO;
import com.task.po.Student;
import com.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MemcachedService")
public class MemcachedService implements StudentService {


    @Autowired
    MemcachedUtils memcachedUtils;

    @Autowired
    StudentDAO studentDAO;

    @Override
    public List<Student> show() {
        Object result = memcachedUtils.get("studentlist");
        if (null != result) {
            System.out.println("redis");
            List<Student> studentList1 = (List<Student>) result;
            return studentList1;
        } else {
            List<Student> studentList2 = studentDAO.show();
            memcachedUtils.set("studentlist", studentList2);
            return studentList2;
        }
    }

    @Override
    public Integer countByWorking() {
        Object result = memcachedUtils.get("countByWorking");
        if (null != result) {
            Integer countByWorking = (Integer) result;
            return countByWorking;
        } else {
            Integer countByWorking = studentDAO.countByWorking();
            memcachedUtils.set("countByWorking", countByWorking);
            return countByWorking;
        }
    }

    @Override
    public Integer countByLearning() {
        Object result = memcachedUtils.get("countByLearning");
        if (null != result) {
            Integer countByLearning = (Integer) result;
            return countByLearning;
        } else {
            Integer countByLearning = studentDAO.countByLearning();
            memcachedUtils.set("countByLearning", countByLearning);
            return countByLearning;
        }
    }


}
