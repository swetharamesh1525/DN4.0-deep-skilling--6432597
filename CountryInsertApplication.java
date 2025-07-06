package com.cognizant.country_insert;

import com.cognizant.country_insert.model.Country;
import com.cognizant.country_insert.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryInsertApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryInsertApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Country country = new Country();
        country.setCode("JP");
        country.setName("Japan");
        countryService.addCountry(country);

        System.out.println("Inserted: " + country);
    }
}
