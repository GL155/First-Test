package com.example.firsttest.service;

import com.example.firsttest.model.SalaryRequest;
import com.example.firsttest.model.SalaryResponse;

public class FirstService {

    public String firstMethod() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>HTML Buttons</h2>\n" +
                "<p>HTML buttons are defined with the button tag:</p>\n" +
                "\n" +
                "<button>Click me</button>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

    public SalaryResponse calculateSalary(SalaryRequest salaryRequest) {
        return SalaryResponse.builder()
                .dayMaxSalary(salaryRequest.getRate() * 8)
                .totalSalary(salaryRequest.getHours() * salaryRequest.getRate())
                .build();
    }
}
