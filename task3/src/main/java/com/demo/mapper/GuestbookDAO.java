package com.demo.mapper;

import com.demo.pojo.Guestbook;

import java.util.List;

public interface GuestbookDAO {
    int deleteByPrimaryKey(Integer guestbookId);

    int insert(Guestbook record);

    int insertSelective(Guestbook record);

    Guestbook selectByPrimaryKey(Integer guestbookId);

    int updateByPrimaryKeySelective(Guestbook record);

    int updateByPrimaryKey(Guestbook record);

    List<Guestbook> selectByWorksId(Integer worksId);
}