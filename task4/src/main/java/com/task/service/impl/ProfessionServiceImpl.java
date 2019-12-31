package com.task.service.impl;

import com.task.dao.ProfessionDAO;
import com.task.po.Profession;
import com.task.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("ProfessionService")
public class ProfessionServiceImpl implements ProfessionService {

    @Autowired
    ProfessionDAO professionDAO;

    //列出职业id为1到5的发展方向
    //1前端2后端3.移动开发4.全站开发5.运营维护
    @Override
    public HashMap<String, List> getListProfession() {
        List<Profession> listId1 = professionDAO.getListProfession(1);
        List<Profession> listId2 = professionDAO.getListProfession(2);
        List<Profession> listId3 = professionDAO.getListProfession(3);
        List<Profession> listId4 = professionDAO.getListProfession(4);
        List<Profession> listId5 = professionDAO.getListProfession(5);
        HashMap<String,List> hashMap=new HashMap();
        hashMap.put("listId1",listId1);
        hashMap.put("listId2",listId2);
        hashMap.put("listId3",listId3);
        hashMap.put("listId4",listId4);
        hashMap.put("listId5",listId5);
        return hashMap;

    }
}
