package com.task.dao;

import com.task.po.Profession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionDAO {
    int deleteByPrimaryKey(Long id);

    int insert(Profession record);

    int insertSelective(Profession record);

    Profession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Profession record);

    int updateByPrimaryKey(Profession record);

    List<Profession> getListProfession(Integer classifyId);
}