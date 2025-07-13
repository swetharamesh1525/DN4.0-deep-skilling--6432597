package com.cognizant.Rest_Demo.Controller;

import com.cognizant.Rest_Demo.model.Country;
import com.cognizant.Rest_Demo.service.CountryService;
import com.cognizant.Rest_Demo.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        return countryService.getCountry(code);
    }
}
