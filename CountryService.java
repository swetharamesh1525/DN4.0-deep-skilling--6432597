package com.example.countrycrud.service;

import com.example.countrycrud.model.Country;
import com.example.countrycrud.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    public Country findCountryByCode(String code) {
        Optional<Country> result = countryRepository.findById(code);
        return result.orElse(null);
    }
}
