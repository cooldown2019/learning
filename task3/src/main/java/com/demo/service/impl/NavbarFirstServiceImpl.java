package com.demo.service.impl;

import com.demo.mapper.NavbarFirstDAO;
import com.demo.pojo.NavbarFirst;
import com.demo.service.NavbarFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NavbarFirstService")
public class NavbarFirstServiceImpl implements NavbarFirstService {
    @Autowired
    NavbarFirstDAO navbarFirstDAO;

    @Override
    public NavbarFirst selectByPrimaryKey(Integer firstId) {
        return navbarFirstDAO.selectByPrimaryKey(firstId);
    }

    @Override
    public List<NavbarFirst> listFirst() {
        return navbarFirstDAO.listFirst();
    }

}
