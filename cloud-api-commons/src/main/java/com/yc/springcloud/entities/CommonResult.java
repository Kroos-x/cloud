package com.yc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述: 公共返回类
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String msg;

    private T data;

    /**
     * 数据为空的时候使用的构造器
     *
     * @param code    返回code
     * @param messgae 消息
     */
    public CommonResult(Integer code, String messgae) {
        this(code, messgae, null);
    }

}
