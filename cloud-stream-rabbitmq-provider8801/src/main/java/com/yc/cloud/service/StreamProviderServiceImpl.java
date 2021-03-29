package com.yc.cloud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * 功能描述:
 * <p>
 * EnableBinding: channel和exchange绑定在一起
 *
 * @Author: xieyc
 * @Date: 2021-03-29
 */
@RequiredArgsConstructor
@EnableBinding(Source.class)
public class StreamProviderServiceImpl implements StreamProviderService {

    private final MessageChannel output;

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        System.out.println(uuid);
        return uuid;
    }


}
