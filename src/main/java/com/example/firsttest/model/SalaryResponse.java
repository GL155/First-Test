package com.example.firsttest.model;


import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class SalaryResponse implements Serializable {
    private double totalSalary;
    private double dayMaxSalary;
}
