package com.pragmatic.spring.main.cyberpunk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class CyberPunkController {

    @GetMapping("/")
    public String send(Model model) {
        CyberPunkModel state = new CyberPunkModel(2045, "desire");
        CyberPunkModel stateTwo = new CyberPunkModel(2080, "dark city");
        model.addAttribute("cyber_punk_realities", List.of(state, stateTwo));
//        model.addAttribute("cyber_punk_realities", null);
        log.info("message to the cyberPunk reality");
        return "CyberPunkView";
    }


}
