package com.yc.springcloud.service;

import com.yc.springcloud.entities.Pay;
import org.apache.ibatis.annotations.Param;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
public interface PayService {

    public int create(Pay pay);

    public Pay getPayMentById(@Param("id") String id);
}
