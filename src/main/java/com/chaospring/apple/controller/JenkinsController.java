package com.chaospring.apple.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenkinsController {


    @GetMapping("/a")
    public String a() {
        return "a";
    }
}
