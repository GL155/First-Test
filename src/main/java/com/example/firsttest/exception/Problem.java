package com.example.firsttest.exception;

import lombok.Builder;
import lombok.Data;

import java.net.URI;

@Data
@Builder
public class Problem {
    String messageTitle;
    String detail;
    Integer statusCode;
    URI instance;
}
