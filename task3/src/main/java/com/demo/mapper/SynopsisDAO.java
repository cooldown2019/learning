package com.demo.mapper;

import com.demo.pojo.Synopsis;

import java.util.List;

public interface SynopsisDAO {
    int deleteByPrimaryKey(Integer synopsisId);

    int insert(Synopsis record);

    int insertSelective(Synopsis record);

    Synopsis selectByPrimaryKey(Integer synopsisId);

    List<Synopsis> listSynopsis();

    int updateByPrimaryKeySelective(Synopsis record);

    int updateByPrimaryKey(Synopsis record);
}