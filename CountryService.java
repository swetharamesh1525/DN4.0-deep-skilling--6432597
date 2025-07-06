package com.cognizant.country_insert.service;
import com.cognizant.country_insert.model.Country;
import com.cognizant.country_insert.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public void addCountry(Country country) {
        countryRepository.save(country);
    }
}
