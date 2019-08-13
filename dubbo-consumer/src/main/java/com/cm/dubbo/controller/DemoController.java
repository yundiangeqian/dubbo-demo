package com.cm.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cm.dubbo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/12 18:37
 */
@RequestMapping("/dubbo")
@RestController
public class DemoController {
    @Reference
    private DemoService demoService;

    @GetMapping("/say/{content}")
    public String say(@PathVariable(name = "content") String content) {
        return demoService.say(content);
    }
}
