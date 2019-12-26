package com.demo.service.impl;

import com.demo.mapper.VisitorDAO;
import com.demo.pojo.Visitor;
import com.demo.service.VisitorService;
import com.demo.tool.StringRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


@Service("VisitService")
public class VisitorServiceImpl  implements VisitorService {

    @Autowired
    VisitorDAO visitorDAO;
    @Autowired
    StringRandom stringRandom;

    @Override
    public Visitor insertName() {
       String name= stringRandom.getStringRandom(10);
       int i =visitorDAO.insertName(name);
       if (i>0){Visitor visitor=new Visitor();
        visitor.setVisitorName(name);
        return visitor;
       }
        return null;
    }
}