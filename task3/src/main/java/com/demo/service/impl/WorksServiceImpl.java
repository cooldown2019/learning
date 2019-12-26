package com.demo.service.impl;

import com.demo.mapper.GuestbookDAO;
import com.demo.mapper.WorksDAO;
import com.demo.pojo.Works;
import com.demo.service.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("WorksService")
public class WorksServiceImpl implements WorksService {

    @Autowired
    private WorksDAO worksDAO;

    @Autowired
    private GuestbookDAO guestbookDAO;
    /*
    作品搜索
    根据id查找
    或者根据名字进行简单模糊查询
    like  #{worksName}

     */


    @Override
    public Works selectByPrimaryKey(Integer worksId) {
        return worksDAO.selectByPrimaryKey(worksId);
    }

    @Override
    public Works selectByName(String worksName) {
        String name="%"+worksName+"%";
        return worksDAO.selectByName(name);
    }


    public Map selectAll(Integer worksId) {
        Works works = worksDAO.selectByPrimaryKey(worksId);
        List list = guestbookDAO.selectByWorksId(worksId);
        Map worksMap =new HashMap();
        worksMap.put("works",works);
        worksMap.put("list",list);
        return worksMap;
    }
}
