package com.yc.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-04-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    /**
     * 主键
     */
    private String id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 购买数量
     */
    private String count;
    /**
     * 订单金额
     */
    private String money;
    /**
     * 订单状态
     */
    private String status;

}
