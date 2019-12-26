package com.demo.mapper;

import com.demo.pojo.Works;


public interface WorksDAO {
    int deleteByPrimaryKey(Integer worksId);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer worksId);

    Works selectByName(String name);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);



}