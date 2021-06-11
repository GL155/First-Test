package com.example.firsttest.controller;

import com.example.firsttest.model.SalaryRequest;
import com.example.firsttest.model.SalaryResponse;
import com.example.firsttest.service.FirstService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class FirstController {

    private FirstService firstService = new FirstService();

    @GetMapping("/first")
    public String firstMethod() {
        return firstService.firstMethod();
    }

    @PostMapping(path="/calculate/salary" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SalaryResponse> calculateSalaryFromHours(final @Valid @RequestBody SalaryRequest salaryRequest) {
        return ResponseEntity.ok(firstService.calculateSalary(salaryRequest));
    }
}
