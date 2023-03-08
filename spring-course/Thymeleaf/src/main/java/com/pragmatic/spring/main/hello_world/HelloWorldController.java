package com.pragmatic.spring.main.hello_world;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HelloWorldController {

    @GetMapping("/")
    public String send() {
        log.info("execute the Controller Spring MVC");
        return "index";
    }

}
