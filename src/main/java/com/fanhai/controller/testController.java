package com.fanhai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class testController {
    @RequestMapping
    public String test(){
        return "index";
    }
}
