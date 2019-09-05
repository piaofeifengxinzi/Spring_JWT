package com.zhang.Api.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class MobileController {
    @RequestMapping("/helloworld")
    public String TestPath(){
        return "hello_world";
    }
}
