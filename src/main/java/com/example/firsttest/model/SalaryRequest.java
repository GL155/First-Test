package com.example.firsttest.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
@Builder
public class SalaryRequest implements Serializable {

    @Min(value = 1 , message = "Hours can't be less than 1")
    @Max(value = 248 , message = "Hours can't be more than maximum monthly hours")
    private int hours;

    @Min(value = 1 , message = "Rates can't be less than 1")
    private double rate;
}
