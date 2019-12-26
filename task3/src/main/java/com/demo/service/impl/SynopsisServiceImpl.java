package com.demo.service.impl;

import com.demo.mapper.SynopsisDAO;
import com.demo.pojo.Synopsis;
import com.demo.service.SynopsisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SynopsisService")
public class SynopsisServiceImpl implements SynopsisService {

    @Autowired
    SynopsisDAO synopsisDAO;

    @Override
    public Synopsis selectByPrimaryKey(Integer synopsisId) {
        return synopsisDAO.selectByPrimaryKey(synopsisId);
    }

    @Override
    public List<Synopsis> listSynopsis() {
        return synopsisDAO.listSynopsis();
    }
}
