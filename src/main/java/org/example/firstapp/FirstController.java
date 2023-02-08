package org.example.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class FirstController {
    @GetMapping("/hello")
    public String sayHello(){
        return "file";
    }
}
