package com.qualco.nationsExplorer.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "country_stats")
@Data
public class CountryStats {

    @Id
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @Id
    private Integer year;
    private Integer population;
    private BigDecimal gdp;
}
