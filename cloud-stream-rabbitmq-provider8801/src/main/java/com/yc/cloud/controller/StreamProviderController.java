package com.yc.cloud.controller;

import com.yc.cloud.service.StreamProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-03-29
 */
@RestController
@RequiredArgsConstructor
public class StreamProviderController {

    private final StreamProviderService service;

    @GetMapping("/send")
    public String send() {
        return service.send();
    }
}
