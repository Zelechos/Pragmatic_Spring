package com.pragmatic.spring.main.sectors;

import lombok.Data;

@Data
public class SectorModel {

    private int id;
    private String sectorName;
    private String investigationArea;
    private String antiquity;
    private String primeReason;

    public SectorModel(int id, String sectorName, String antiquity, String investigationArea, String primeReason) {
        this.id = id;
        this.sectorName = sectorName;
        this.investigationArea = investigationArea;
        this.antiquity = antiquity;
        this.primeReason = primeReason;
    }
}
