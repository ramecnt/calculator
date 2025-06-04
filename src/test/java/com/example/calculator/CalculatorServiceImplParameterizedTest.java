package com.example.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParameterizedTest {

    CalculatorServiceImpl calculatorServiceImpl;

    @BeforeEach
    void setUp() {
        calculatorServiceImpl = new CalculatorServiceImpl();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "319, 23, 342",
            "0, 0, 0"})
    void CalculatorPlus(Integer num1, Integer num2, Integer expected) {
        Integer actual = calculatorServiceImpl.plusCalc(num1, num2);
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "7, 4, 3",
            "300, 50, 250",
            "999, 9, 990"})
    void CalculatorMinus(Integer num1, Integer num2, Integer expected) {
        Integer actual = calculatorServiceImpl.minusCalc(num1, num2);
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "2, 7, 14",
            "5, 5, 25",
            "12, 3, 36"})
    void CalculatorMultiple(Integer num1, Integer num2, Integer expected) {
        Integer actual = calculatorServiceImpl.multipleCalc(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "30, 2, 15",
            "36, 6, 6",
            "12, 3, 4"})
    void CalculatorDivide(Integer num1, Integer num2, Float expected) {
        Float actual = calculatorServiceImpl.divideCalc(num1, num2);
        assertEquals(expected, actual);
    }
}