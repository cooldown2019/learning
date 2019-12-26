package com.demo.mapper;

import com.demo.pojo.Visitor;

public interface VisitorDAO {
    int deleteByPrimaryKey(Integer visitorId);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Visitor selectByPrimaryKey(Integer visitorId);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);

    int insertName(String name);
}