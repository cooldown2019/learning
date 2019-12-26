package com.demo.service.impl;

import com.demo.mapper.BannerDAO;
import com.demo.pojo.Banner;
import com.demo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BannerService")
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerDAO bannerDAO;


    @Override
    public Banner selectByPrimaryKey(Integer bannerId) {
        return bannerDAO.selectByPrimaryKey(bannerId);
    }
}
