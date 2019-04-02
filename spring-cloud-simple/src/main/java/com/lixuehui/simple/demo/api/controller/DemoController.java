package com.lixuehui.simple.demo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "simple/api")
public class DemoController {

    @RequestMapping(value = "/ping", method = RequestMethod.POST)
    public String ping(String seq) {
        return "pong:" + seq;
    }
}
