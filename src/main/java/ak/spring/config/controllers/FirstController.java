package ak.spring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String first,
                            @RequestParam(value = "surname", required = false) String second,
                            Model model) {
        model.addAttribute("greetings", "Hello, " + first + " " + second);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }


}
