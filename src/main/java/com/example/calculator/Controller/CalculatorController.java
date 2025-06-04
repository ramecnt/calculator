package com.example.calculator.Controller;


import com.example.calculator.Service.CalculatorService;
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

    @GetMapping(path = "/")
    public String welcomePage() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public Integer plusCalculate(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.plusCalc(num1, num2);
    }

    @GetMapping(path = "/minus")
    public Integer minusCalculate(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.minusCalc(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public Integer multipleCalculate(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.multipleCalc(num1, num2);
    }

    @GetMapping(path = "/divide")
    public Float divideCalculate(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.divideCalc(num1, num2);
    }
}
