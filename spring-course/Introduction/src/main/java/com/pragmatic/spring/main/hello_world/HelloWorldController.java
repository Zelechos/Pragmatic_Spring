package com.pragmatic.spring.main.hello_world;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping("/")
    public String send() {
        log.info("execute the REST Controller HELLO WORLD");
        return "<h1>Hello Hacker, Welcome to Spring<h1>";
    }

    @GetMapping("/sub")
    public String subtitle() {
        log.info("execute the subtitle of the code");
        log.debug("mas detalle del controlador");
        return "<hr/><h3>The project Spring is the Best<h3>";
    }

}
