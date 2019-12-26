package com.demo.service;

import com.demo.pojo.Works;

import java.util.Map;

public interface WorksService  {

    Works selectByPrimaryKey(Integer worksId);

    Works selectByName(String worksName);

     Map selectAll(Integer worksId);

}
