package com.example.hellogithubactions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "welcome";
    }
}
