package com.qualco.nationsExplorer.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "country_languages")
@Data
public class CountryLanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @Id
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
    @Column(nullable = false, columnDefinition = "tinyint", length = 1)
    private boolean official;
}
