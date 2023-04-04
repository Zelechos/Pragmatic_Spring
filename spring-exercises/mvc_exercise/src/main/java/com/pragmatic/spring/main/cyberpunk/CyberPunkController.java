package com.pragmatic.spring.main.cyberpunk;

import com.pragmatic.spring.main.sectors.SectorModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class CyberPunkController {


//    values que podemos traer de las application.properties
    @Value("${index.warning}")
    private String messageWarning;

    @Value("${message.ia}")
    private String messageIa;

    @GetMapping("/")
    public String send(Model model) {
        var message = "Welcome to the CyberPunk with Spring";
        model.addAttribute("message", message);
        model.addAttribute("messageWarning", messageWarning);
        model.addAttribute("messageIa", messageIa);
        log.info("message to the cyberPunk reality");
        return "index";
    }


}
