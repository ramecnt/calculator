package com.example.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public Integer plusCalc(Integer num1, Integer num2) {
        validate(num1, num2);
        return num1 + num2;
    }

    public Integer minusCalc(Integer num1, Integer num2) {
        validate(num1, num2);
        return num1 - num2;
    }

    public Integer multipleCalc(Integer num1, Integer num2) {
        validate(num1, num2);
        return num1 * num2;
    }

    public Float divideCalc(Integer num1, Integer num2) {
        validate(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException("Divide by zero");
        }
        return (float) num1 / num2;
    }

    public void validate(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
