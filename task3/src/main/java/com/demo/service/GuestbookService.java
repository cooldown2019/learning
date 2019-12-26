package com.demo.service;

import com.demo.pojo.Guestbook;

import java.util.List;

public interface GuestbookService {

    List<Guestbook> selectByWorksId(Integer worksId);

    int insertSelective(Guestbook record);
}
