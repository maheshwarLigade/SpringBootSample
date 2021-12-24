package com.maheshwar.springbootdevops;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String helloworld(){

        return "Hello World from github action with heroku";
    }
}
