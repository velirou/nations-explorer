package com.qualco.nationsExplorer.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "regions")
@Data
public class Region {

    @Id
    private Integer regionId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;
}
