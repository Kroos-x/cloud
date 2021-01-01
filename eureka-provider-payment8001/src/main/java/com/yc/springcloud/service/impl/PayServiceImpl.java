package com.yc.springcloud.service.impl;

import com.yc.springcloud.dao.PayMapper;
import com.yc.springcloud.entities.Pay;
import com.yc.springcloud.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@Service
public class PayServiceImpl implements PayService {

    @Resource
    private PayMapper payMapper;

    @Override
    public int create(Pay pay) {
        return payMapper.create(pay);
    }

    @Override
    public Pay getPayMentById(String id) {
        return payMapper.getPayMentById(id);
    }
}
