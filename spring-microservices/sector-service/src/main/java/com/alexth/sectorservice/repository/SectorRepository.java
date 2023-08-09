package com.alexth.sectorservice.repository;

import com.alexth.sectorservice.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SectorRepository extends JpaRepository<Sector, UUID> {

}
