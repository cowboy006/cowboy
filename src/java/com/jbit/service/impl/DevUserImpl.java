package com.jbit.service.impl;

import com.jbit.dao.DevUserMapper;
import com.jbit.entity.DevUser;
import com.jbit.service.Devuserservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/4.
 */
@Service("devuserservice")
public class DevUserImpl implements Devuserservice{
    @Resource
    private DevUserMapper devUserMapper;

    @Override
    public DevUser findloging(DevUser devUser) {


        return devUserMapper.findloging(devUser);
    }
}
