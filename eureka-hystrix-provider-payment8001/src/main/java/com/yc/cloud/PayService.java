package com.yc.cloud;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-01-02
 */
@Service
public class PayService {

    /**
     * 可以正常访问的方法
     *
     * @param id
     * @return
     */
    public String paymentinfo_Ok(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_OK，id:" + id;
    }

    /**
     * 超时访问的方法
     */
    public String paymentinfo_Timeout(Integer id) {
        int interTime = 3;
        try {
            TimeUnit.SECONDS.sleep(interTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_Timeout，id:" + id + "耗时" + interTime + "秒钟--";
    }


}
