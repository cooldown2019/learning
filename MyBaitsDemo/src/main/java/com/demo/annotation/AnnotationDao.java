package com.demo.annotation;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AnnotationDao {
    @Select({"select *from user "})
    List<User> selectAll();

}
