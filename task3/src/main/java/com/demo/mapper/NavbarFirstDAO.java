package com.demo.mapper;

import com.demo.pojo.NavbarFirst;

import java.util.List;

public interface NavbarFirstDAO {
    int deleteByPrimaryKey(Integer firstId);

    int insert(NavbarFirst record);

    int insertSelective(NavbarFirst record);

    NavbarFirst selectByPrimaryKey(Integer firstId);

    List<NavbarFirst> listFirst();

    int updateByPrimaryKeySelective(NavbarFirst record);

    int updateByPrimaryKey(NavbarFirst record);
}