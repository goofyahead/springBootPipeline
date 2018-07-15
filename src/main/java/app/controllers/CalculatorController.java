package app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/")
    public String hello() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return String.valueOf(a + b);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
        return String.valueOf(a * b);
    }
}
