package com.example.testdemo.controller;

import com.example.testdemo.mapper.MyAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MyAccountMapper myAccountMapper;
    @RequestMapping("hello")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("hello1")
    public String hello1(){
        return myAccountMapper.selectByName("张三").toString();
    }
}
