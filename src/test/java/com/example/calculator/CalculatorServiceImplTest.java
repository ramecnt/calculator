package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplTest {

    CalculatorServiceImpl calculatorServiceImpl;

    @BeforeEach
    void setUp() {
        calculatorServiceImpl = new CalculatorServiceImpl();
    }

    @Test
    void plusTest() {
        Integer num1 = 2;
        Integer num2 = 3;
        Integer num3 = 8;
        Integer actual1 = 5;
        Integer actual2 = 10;
        Integer result1 = calculatorServiceImpl.plusCalc(num1, num2);
        Integer result2 = calculatorServiceImpl.plusCalc(num1, num3);
        assertEquals(actual1, result1);
        assertEquals(actual2, result2);
    }

    @Test
    void minusTest() {
        Integer num1 = 10;
        Integer num2 = 3;
        Integer num3 = 9;
        Integer actual1 = 7;
        Integer actual2 = 1;
        Integer result1 = calculatorServiceImpl.minusCalc(num1, num2);
        Integer result2 = calculatorServiceImpl.minusCalc(num1, num3);
        assertEquals(actual1, result1);
        assertEquals(actual2, result2);
    }

    @Test
    void multipleTest() {
        Integer num1 = 10;
        Integer num2 = 10;
        Integer num3 = 1;
        Integer actual1 = 100;
        Integer actual2 = 10;
        Integer result1 = calculatorServiceImpl.multipleCalc(num1, num2);
        Integer result2 = calculatorServiceImpl.multipleCalc(num2, num3);
        assertEquals(actual1, result1);
        assertEquals(actual2, result2);
    }

    @Test
    void divideTest() {
        Integer num1 = 12;
        Integer num2 = 3;
        Integer num3 = 2;
        float actual1 = 4;
        float actual2 = 6;
        Float result1 = calculatorServiceImpl.divideCalc(num1, num2);
        Float result2 = calculatorServiceImpl.divideCalc(num1, num3);
        assertEquals(actual1, result1);
        assertEquals(actual2, result2);
    }

    @Test
    void divideZeroTest() {
        Integer num1 = 10;
        Integer num2 = 0;
        assertThrows(IllegalArgumentException.class, () -> calculatorServiceImpl.divideCalc(num1, num2));
    }

    @Test
    void validDataTest() {
        Integer num1 = null;
        Integer num2 = null;
        assertThrows(IllegalArgumentException.class, () -> calculatorServiceImpl.plusCalc(num1, num2));
    }
}
