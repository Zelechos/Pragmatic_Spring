package com.pragmatic.spring.main.sectors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class SectorController {

    @GetMapping("/sectors")
    public String getAllReports(Model model) {

        model.addAttribute("sectors", factorySectors());

        log.info("report to the Sectors");

        return "SectorView";
    }

    @GetMapping("/sector/{id}")
    public String getReport(@PathVariable int id, Model model) {
        factorySectors().forEach(sector -> {
            if (sector.getId() == id) {
                model.addAttribute("sector", sector);
                log.info("report to the --> " + sector);

            }
        });
        return "SectorView";
    }

    private List<SectorModel> factorySectors() {
        var sector = new SectorModel(
                9, "Sector 9", "10 years", "AI - Artificial Intelligence", "Create the ultimate Artificial Intelligence"
        );

        var secondSector = new SectorModel(
                12, "Sector 12", "35 years", "Bot - Robotica", "Create the ultimate Robot"
        );

        var thirdSector = new SectorModel(
                0, "Sector Zero", "75 years", "Transmutation - Transmutation", "Create a android to domain the world"
        );

        return Arrays.asList(sector, secondSector, thirdSector);
    }
}
