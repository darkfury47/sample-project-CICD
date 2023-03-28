package com.spoonythings.sampleprojectCICD.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class CicdController {

    @Value("${cicd.name}")
    private String name;

    @GetMapping("/hello")
    public String sayHelloWorld(){
        String finalString = name;
        return name;
    }
}
