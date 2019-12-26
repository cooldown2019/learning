package com.demo.service;

import com.demo.pojo.NavbarFirst;

import java.util.List;

public interface NavbarFirstService {

    NavbarFirst selectByPrimaryKey(Integer firstId);

    List <NavbarFirst>  listFirst();


}
