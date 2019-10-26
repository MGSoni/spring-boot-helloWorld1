package com.example.springboothelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private Map<String, Object> map = new HashMap<>();

    @RequestMapping("/hello")
    public Map<String, Object> hello(){
        map.put("Mohit", "Soni");
        map.put("Udacity", "Nanodegree");
        return map;
    }
}
