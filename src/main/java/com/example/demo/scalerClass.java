package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class scalerClass {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hi ! How are you?, I am Kiran" ;
    }


    @GetMapping("/hello")
    public String help(){
        return "Hope you are doing well!" ;
    }
}
