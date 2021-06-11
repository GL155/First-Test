package com.example.firsttest.service;

import com.example.firsttest.model.SalaryRequest;
import com.example.firsttest.model.SalaryResponse;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    public SalaryResponse calculateSalary(SalaryRequest salaryRequest) {
        return SalaryResponse.builder()
                .totalMonthlySalary(calculateMonthlySalary(salaryRequest.getHours(), salaryRequest.getRate()))
                .build();
    }

    private double calculateMonthlySalary(int hours, double rate) {
        return hours * rate;
    }
}
