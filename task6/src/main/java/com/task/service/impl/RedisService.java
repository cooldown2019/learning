package com.task.service.impl;

import com.task.cache.RedisUtils;
import com.task.dao.StudentDAO;
import com.task.po.Student;
import com.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("RedisService")
public class RedisService implements StudentService {

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    StudentDAO studentDAO;

    @Override
    public List<Student> show() {
        Object result = redisUtils.get("studentlist");
        if (null != result) {

            List<Student> studentList1 = (List<Student>) result;
            return studentList1;
        } else {
            List<Student> studentList2 = studentDAO.show();
            redisUtils.set("studentlist", studentList2);
            return studentList2;
        }
    }

    @Override
    public Integer countByWorking() {
        Object result = redisUtils.get("countByWorking");
        if (null != result) {

            Integer countByWorking = (Integer) result;
            return countByWorking;
        } else {
            Integer countByWorking = studentDAO.countByWorking();
            redisUtils.set("countByWorking", countByWorking);
            return countByWorking;
        }
    }

    @Override
    public Integer countByLearning() {
        Object result = redisUtils.get("countByLearning");
        if (null != result) {

            Integer countByLearning = (Integer) result;
            return countByLearning;
        } else {
            Integer countByLearning = studentDAO.countByLearning();
            redisUtils.set("countByLearning", countByLearning);
            return countByLearning;
        }
    }
}
