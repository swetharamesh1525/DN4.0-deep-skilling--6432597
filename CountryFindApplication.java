package com.cognizant.country_find;
import com.cognizant.country_find.model.Country;
import com.cognizant.country_find.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryFindApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryFindApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Country country = countryService.findCountryByCode("IN");
        System.out.println("Found: " + country);
    }
}

