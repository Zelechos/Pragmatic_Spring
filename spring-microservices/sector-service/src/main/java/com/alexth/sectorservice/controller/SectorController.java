package com.alexth.sectorservice.controller;

import com.alexth.sectorservice.entity.Sector;
import com.alexth.sectorservice.service.SectorService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/sector")
public class SectorController {
    private final SectorService sectorService;

    public SectorController(SectorService sectorService) {
        this.sectorService = sectorService;
    }

    @PostMapping("/create")
    public Sector createSector(@RequestBody Sector sector) {
        return this.sectorService.createSector(sector);
    }

    @GetMapping("/{id}")
    public Sector getSectorById(@PathVariable("id") UUID id) {
        return this.sectorService.getSectorById(id);
    }

    @GetMapping("/sectors")
    public List<Sector> getAll() {
        return this.sectorService.getAll();
    }
}
