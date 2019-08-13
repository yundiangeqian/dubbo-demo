package com.cm.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cm.dubbo.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/12 17:26
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String say(String content) {
        return "say " + content;
    }
}
