package com.example.firsttest.controller;

import com.example.firsttest.service.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/first")
    public String firstMethod() {
        var firstService = new FirstService();
        return firstService.firstMethod();
    }

    @GetMapping("/second")
    public String secondMethod() {
        return "Test2";
    }
}
