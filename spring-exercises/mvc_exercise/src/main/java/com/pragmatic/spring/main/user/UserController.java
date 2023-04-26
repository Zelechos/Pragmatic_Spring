package com.pragmatic.spring.main.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UserController {

    @GetMapping("/user")
    public String getUser(Model model) {
        UserModel user = new UserModel(1, "Alex", "Tumiri", "alexth@gmail.com", "623452345");
        model.addAttribute("user", user);
        log.info("get the user --> "+ user);
        return "UserView";
    }


}
