package com.qualco.nationsExplorer.service;

import com.qualco.nationsExplorer.model.Country;
import com.qualco.nationsExplorer.dto.CountryHighestGpdYearDTO;
import com.qualco.nationsExplorer.dto.RegionCountriesStatsDTO;
import com.qualco.nationsExplorer.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAllByOrderByNameAscAreaAscCountryCode2Asc();
    }

    @Override
    public List<String> getLanguagesByCountry(Long countryId) {
        return countryRepository.findLanguagesByCountryId(countryId);
    }

    @Override
    public List<CountryHighestGpdYearDTO> getMaxGdpYear() {
        return countryRepository.findMaxGdpYear();
    }

    @Override
    public List<RegionCountriesStatsDTO> findRegionStats(String regionName, Integer dateFrom, Integer dateTo) {
        return countryRepository.findRegionStats(regionName, dateFrom, dateTo);
    }
}
