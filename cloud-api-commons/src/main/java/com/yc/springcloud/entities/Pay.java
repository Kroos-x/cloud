package com.yc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能描述: 支付表
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pay implements Serializable {

    /**
     * id
     */
    private String id;
    /**
     * 流水号
     */
    private String serial;
}
