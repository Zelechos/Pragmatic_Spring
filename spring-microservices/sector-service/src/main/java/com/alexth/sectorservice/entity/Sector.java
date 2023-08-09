package com.alexth.sectorservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "sectors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private String investigationArea;
    private String foundationDate;
    private Integer qualifiedPersonnel;
    private String securityCode;


}
