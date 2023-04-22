package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        "make code broken to test jenkin"
        return name + ", welcome to demo jenkins with spring app and maven";
    }
}
