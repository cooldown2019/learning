package com.task.service;


import com.task.po.Student;

import java.util.List;

public interface StudentService {


    //展示优秀学员
    List<Student> show();
    //计算找到工作的学员人数
    Integer countByWorking();
    //计算正在学习的学员人数；
    Integer countByLearning();
}
