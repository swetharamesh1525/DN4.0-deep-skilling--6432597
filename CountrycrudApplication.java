package com.example.countrycrud;

import com.example.countrycrud.model.Country;
import com.example.countrycrud.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountrycrudApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountrycrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Step 1: Create and save country
        Country country = new Country();
        country.setCode("FR");
        country.setName("France");
        countryService.addCountry(country);

        // Step 2: Retrieve country by code
        Country retrieved = countryService.findCountryByCode("FR");
        System.out.println("Retrieved Country: " + retrieved);
    }
}
