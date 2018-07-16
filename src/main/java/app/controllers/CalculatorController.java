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


    @RequestMapping("/divide")
    public String divide(@RequestParam("a") int a, @RequestParam("b") int b) throws Exception {
        if (b > 0) {
            return String.valueOf(a / b);
        } else {
            System.out.println("dividing by 0, warning!");
            throw new Exception("cant divide by 0");
        }
    }
}
