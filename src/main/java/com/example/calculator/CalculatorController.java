package com.example.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/plus")
    public String calculatePlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.CalculatorPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculateMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.CalculatorMinus(num1, num2);
    }

    @GetMapping(path = "/multiple")
    public String calculateMultiple(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.CalculatorMultiple(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculateDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.CalculatorDivide(num1, num2);
    }
}
