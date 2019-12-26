package com.demo.service.impl;

import com.demo.mapper.NavbarSecondDAO;
import com.demo.pojo.NavbarSecond;
import com.demo.service.NavbarSecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NavbarSecondService")
public class NavbarSecondServiceImpl implements NavbarSecondService {
    @Autowired
    NavbarSecondDAO navbarSecondDAO;

    @Override
    public NavbarSecond selectByPrimaryKey(Integer secondId) {
        return navbarSecondDAO.selectByPrimaryKey(secondId);
    }

    @Override
    public List<NavbarSecond> listSecond() {
        return navbarSecondDAO.listSecond();
    }

    @Override
    public List<NavbarSecond> selectByFirstId(Integer firstid) {
        return navbarSecondDAO.selectByFirstId(firstid);
    }
}
