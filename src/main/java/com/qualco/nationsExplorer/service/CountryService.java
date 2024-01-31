package com.qualco.nationsExplorer.service;

import com.qualco.nationsExplorer.model.Country;
import com.qualco.nationsExplorer.dto.CountryHighestGpdYearDTO;
import com.qualco.nationsExplorer.dto.RegionCountriesStatsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {
    List<Country> getAllCountries();
    List<String> getLanguagesByCountry(Long countryId);
    List<CountryHighestGpdYearDTO> getMaxGdpYear();
    List<RegionCountriesStatsDTO> findRegionStats(String regionName, Integer dateFrom, Integer dateTo);
}
