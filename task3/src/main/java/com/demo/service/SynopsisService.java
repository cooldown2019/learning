package com.demo.service;

import com.demo.pojo.Synopsis;

import java.util.List;

public interface SynopsisService {

    Synopsis selectByPrimaryKey(Integer synopsisId);
    List<Synopsis> listSynopsis();
}
