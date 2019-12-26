package com.demo.service.impl;

import com.demo.mapper.GuestbookDAO;
import com.demo.pojo.Guestbook;
import com.demo.service.GuestbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("GuestbookService")
public class GuestbookServiceImpl implements GuestbookService {
    @Autowired
    GuestbookDAO guestbookDAO;
    @Override
    public List<Guestbook> selectByWorksId(Integer worksId) {
        return guestbookDAO.selectByWorksId(worksId);
    }

    @Override
    public int insertSelective(Guestbook record) {
        return guestbookDAO.insert(record);
    }
}
