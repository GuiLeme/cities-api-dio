package com.github.guilhermeleme.citiesapi.countries.repository;

import com.github.guilhermeleme.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
