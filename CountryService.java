package com.cognizant.Rest_Demo.service;

import com.cognizant.Rest_Demo.model.Country;
import com.cognizant.Rest_Demo.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    public Country getCountry(String code) throws CountryNotFoundException {
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundException("Country not found"));
    }
}
