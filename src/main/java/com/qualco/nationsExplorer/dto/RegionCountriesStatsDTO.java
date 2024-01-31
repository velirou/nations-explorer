package com.qualco.nationsExplorer.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegionCountriesStatsDTO {

    private String continentName;
    private String regionName;
    private String countryName;
    private Integer countryStatsYear;
    private Integer countryStatsPopulation;
    private BigDecimal getCountryStatsGdp;

    public RegionCountriesStatsDTO(String continentName, String regionName, String countryName, Integer countryStatsYear, Integer countryStatsPopulation, BigDecimal getCountryStatsGdp) {
        this.continentName = continentName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.countryStatsYear = countryStatsYear;
        this.countryStatsPopulation = countryStatsPopulation;
        this.getCountryStatsGdp = getCountryStatsGdp;
    }
}
