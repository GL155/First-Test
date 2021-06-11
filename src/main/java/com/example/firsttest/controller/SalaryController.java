package com.example.firsttest.controller;

import com.example.firsttest.model.SalaryRequest;
import com.example.firsttest.model.SalaryResponse;
import com.example.firsttest.service.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class SalaryController {

    private final SalaryService salaryService;

    @PostMapping(path="/calculate/salary" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SalaryResponse> calculateSalaryFromHours(final @Valid @RequestBody SalaryRequest salaryRequest) {
        return ResponseEntity.ok(salaryService.calculateSalary(salaryRequest));
    }
}
