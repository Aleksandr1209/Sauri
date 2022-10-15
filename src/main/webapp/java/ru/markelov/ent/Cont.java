package ru.markelov.ent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cont {
    @GetMapping("/index")
    public String sayHello(){
        return "index";
    }
}
