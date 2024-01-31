package com.qualco.nationsExplorer.repository;

import com.qualco.nationsExplorer.model.Country;
import com.qualco.nationsExplorer.dto.CountryHighestGpdYearDTO;
import com.qualco.nationsExplorer.dto.RegionCountriesStatsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    List<Country> findAllByOrderByNameAscAreaAscCountryCode2Asc();
    @Query("SELECT l.language FROM CountryLanguage cl " +
            "JOIN cl.language l " +
            "JOIN cl.country c " +
            "WHERE c.countryId = :countryId")
    List<String> findLanguagesByCountryId(Long countryId);
    @Query("SELECT new com.qualco.nationsExplorer.dto.CountryHighestGpdYearDTO(c.name, c.countryCode3, cs.year, cs.population, MAX(cs.gdp)) " +
            "FROM CountryStats cs " +
            "JOIN cs.country c " +
            "GROUP BY cs.country.id")
    List<CountryHighestGpdYearDTO> findMaxGdpYear();
    @Query("SELECT new com.qualco.nationsExplorer.dto.RegionCountriesStatsDTO(c2.name, r.name, c.name, cs.year, cs.population, cs.gdp) " +
            "FROM CountryStats cs " +
            "JOIN cs.country c " +
            "JOIN c.region r " +
            "JOIN r.continent c2 " +
            "WHERE r.name = :regionName AND (cs.year BETWEEN :dateFrom AND :dateTo)")
    List<RegionCountriesStatsDTO> findRegionStats(String regionName, Integer dateFrom, Integer dateTo);
}
