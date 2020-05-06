package com.chaospring.apple.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class JenkinsController {


    @GetMapping("/a")
    public String a() {
        return "a";
    }
}
