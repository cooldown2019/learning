package com.demo.service;

import com.demo.pojo.NavbarFirst;
import com.demo.pojo.NavbarSecond;

import java.util.List;

public interface NavbarSecondService {
    NavbarSecond selectByPrimaryKey(Integer firstId);

    List<NavbarSecond> listSecond();

    List<NavbarSecond> selectByFirstId(Integer firstid);
}
