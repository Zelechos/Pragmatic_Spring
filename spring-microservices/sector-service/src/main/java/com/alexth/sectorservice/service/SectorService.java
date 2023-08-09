package com.alexth.sectorservice.service;

import com.alexth.sectorservice.entity.Sector;
import com.alexth.sectorservice.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SectorService {
    private final SectorRepository sectorRepository;

    @Autowired
    public SectorService(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }

    public Sector createSector(Sector sector) {
        return sectorRepository.save(sector);
    }

    public Sector getSectorById(UUID id) {
        Optional<Sector> optionalSector = sectorRepository.findById(id);
        return optionalSector.orElse(null);
    }

    public List<Sector> getAll() {
        return sectorRepository.findAll();
    }

}
