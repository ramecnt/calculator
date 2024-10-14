package com.example.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String CalculatorPlus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String CalculatorMinus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String CalculatorMultiple(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String CalculatorDivide(int num1, int num2) {
        float result = (float) num1 / num2;
        return num1 + " + " + num2 + " = " + result;
    }
}
