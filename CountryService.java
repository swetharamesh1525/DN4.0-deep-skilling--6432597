package com.cognizant.countryquery.service;
import com.cognizant.countryquery.model.Country;
import com.cognizant.countryquery.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> searchContaining(String text) {
        return countryRepository.findByNameContaining(text);
    }

    public List<Country> searchContainingSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    public List<Country> searchStartingWith(String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }
}
