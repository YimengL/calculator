package com.yimeng.calculator.services;

import org.springframework.stereotype.Service;

/**
 * Service class: {@link Calculator}.
 */
@Service
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}
