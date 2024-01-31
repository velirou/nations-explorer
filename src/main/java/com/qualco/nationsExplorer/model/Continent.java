package com.qualco.nationsExplorer.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "continents")
@Data
public class Continent {

    @Id
    private Integer continentId;
    private String name;
}
