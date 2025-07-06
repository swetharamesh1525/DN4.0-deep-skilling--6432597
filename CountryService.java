package com.cognizant.country_find.service;
import com.cognizant.country_find.model.Country;
import com.cognizant.country_find.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country findCountryByCode(String code) {
        Optional<Country> result = countryRepository.findById(code);
        return result.orElse(null);  // or throw custom exception if needed
    }
}

