package com.qualco.nationsExplorer.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "countries")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId;
    private String name;
    private BigDecimal area;
    private LocalDate nationalDay;
    private String countryCode2;
    private String countryCode3;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
