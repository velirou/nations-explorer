package com.qualco.nationsExplorer.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CountryHighestGpdYearDTO {

    private String countryName;
    private String countryCode3;
    private Integer countryStatsYear;
    private Integer countryStatsPopulation;
    private BigDecimal getCountryStatsGdp;

    public CountryHighestGpdYearDTO(String countryName, String countryCode3, Integer countryStatsYear, Integer countryStatsPopulation, BigDecimal getCountryStatsGdp) {
        this.countryName = countryName;
        this.countryCode3 = countryCode3;
        this.countryStatsYear = countryStatsYear;
        this.countryStatsPopulation = countryStatsPopulation;
        this.getCountryStatsGdp = getCountryStatsGdp;
    }
}
