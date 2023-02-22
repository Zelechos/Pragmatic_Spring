package com.example.first_exercise.code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CodeController {
    private static final String codeHelloWorld = "%s";
    private final AtomicLong count = new AtomicLong();

    @GetMapping("/code")
    public Code code(@RequestParam(value = "code", defaultValue = "System.out.println('Hello World');") String code) {
        long currentIndex = count.get();
        ArrayList<String> helloWorld = new ArrayList<>();
        helloWorld.add("print('hello world')");
        helloWorld.add("console.log('hello world')");

        if (currentIndex == 0 || currentIndex == 1) return new Code(
                count.incrementAndGet(),
                helloWorld.get((int) currentIndex)
        );
        return new Code(count.incrementAndGet(), code);
    }

}
