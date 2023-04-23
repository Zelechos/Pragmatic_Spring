package com.pragmatic.spring.main.hello_world;

import com.pragmatic.spring.main.sectors.Sector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class HelloWorldController {


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

    @GetMapping("/sector")
    public String currentReportOfSector(Model model) {
        var sector = new Sector();
        sector.setSectorNumber("Sector 9");
        sector.setAntiquity("10 years");
        sector.setInvestigationArea("AI - Artificial Intelligence");
        sector.setPrimeReason("Create the ultimate Artificial Intelligence");

        var secondSector = new Sector();
        secondSector.setSectorNumber("Sector 12");
        secondSector.setAntiquity("35 years");
        secondSector.setInvestigationArea("Bot - Robotica");
        secondSector.setPrimeReason("Create the ultimate Robot");


        var thirdSector = new Sector();
        thirdSector.setSectorNumber("Sector Zero");
        thirdSector.setAntiquity("75 years");
        thirdSector.setInvestigationArea("Transmutation - Transmutation");
        thirdSector.setPrimeReason("Create a android to domain the world");

        var sectorList = List.of(sector, secondSector, thirdSector);
//        var sectorList = new ArrayList<>();


        model.addAttribute("sectors", sectorList);

        log.info("report to the " + sectorList);
        return "sector";
    }

}
