package com.example.webapppratice01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiController {
    @GetMapping("Hi")
    @RequestMapping("/Hi")
    public String Hi(){
        return  "hi springBoot";
    }
}
