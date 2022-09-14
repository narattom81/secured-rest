package nara.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "hi there";
    }

    @GetMapping("/bye")
    public String bye() {
        return "bye bye";
    }
}
