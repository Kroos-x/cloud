package com.yc.springcloud.dao;

import com.yc.springcloud.entities.Pay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 功能描述: 数据接口
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@Mapper
public interface PayMapper {

    public int create(Pay pay);

    public Pay getPayMentById(@Param("id") String id);
}
