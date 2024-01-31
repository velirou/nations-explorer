package com.qualco.nationsExplorer.controller;

import com.qualco.nationsExplorer.service.CountryService;
import com.qualco.nationsExplorer.model.Country;
import com.qualco.nationsExplorer.dto.CountryHighestGpdYearDTO;
import com.qualco.nationsExplorer.dto.RegionCountriesStatsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CountryController {

    @Autowired
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/languages/{countryId}")
    public List<String> getLanguagesByCountry(@PathVariable Long countryId) {
        return countryService.getLanguagesByCountry(countryId);
    }

    @GetMapping("/maxGdpYear")
    public List<CountryHighestGpdYearDTO> getMaxGdpYear() {
        return countryService.getMaxGdpYear();
    }

    @GetMapping("/regionStats/{regionName}/{dateFrom}/{dateTo}")
    public List<RegionCountriesStatsDTO> findRegionStats(
            @PathVariable(required = false) String regionName,
            @PathVariable(required = false) Integer dateFrom,
            @PathVariable(required = false) Integer dateTo) {
        return countryService.findRegionStats(regionName, dateFrom, dateTo);
    }
}
