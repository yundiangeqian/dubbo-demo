package com.cm.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cm.dubbo.service.DemoService;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/13 9:21
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String say(String content) {
        return content+"is showed";
    }
}
