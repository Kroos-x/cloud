package com.yc.cloud;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-03-29
 */
@Component
@EnableBinding(Sink.class)
public class ConsumerStreamController {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("==========消费者 8803 接收到消息" + message.getPayload()+"\"==========");
    }

}
