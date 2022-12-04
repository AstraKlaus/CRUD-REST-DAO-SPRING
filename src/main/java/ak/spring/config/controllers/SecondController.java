package ak.spring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {

    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }

    @GetMapping("/second/calculator")
    public String calculator(@RequestParam("a") int first,
                             @RequestParam("b") int second,
                             @RequestParam("action") String action,
                             Model model){

        model.addAttribute("answer", getValue(first, second, action));

        return "second/calculator";
    }

    private int getValue(int first, int second, String action){
        return switch (action){
            case "multiplication": yield first * second;
            case "addition": yield first + second;
            case "subtraction": yield first - second;
            case "division": yield first / second;
            default: yield 0;
        };
    }
}
