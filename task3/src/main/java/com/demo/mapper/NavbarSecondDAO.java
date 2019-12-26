package com.demo.mapper;

import com.demo.pojo.NavbarSecond;

import java.util.List;

public interface NavbarSecondDAO {
    int deleteByPrimaryKey(Integer secondId);

    int insert(NavbarSecond record);

    int insertSelective(NavbarSecond record);

    NavbarSecond selectByPrimaryKey(Integer secondId);

    List<NavbarSecond> listSecond();

    int updateByPrimaryKeySelective(NavbarSecond record);

    int updateByPrimaryKey(NavbarSecond record);

    List<NavbarSecond> selectByFirstId(Integer firstid);
}