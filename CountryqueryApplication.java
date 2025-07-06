package com.cognizant.countryquery;
import com.cognizant.countryquery.model.Country;
import com.cognizant.countryquery.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryqueryApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryqueryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Countries containing 'ou' ===");
        countryService.searchContaining("ou")
                .forEach(System.out::println);

        System.out.println("\n=== Countries containing 'ou' sorted ===");
        countryService.searchContainingSorted("ou")
                .forEach(System.out::println);

        System.out.println("\n=== Countries starting with 'Z' ===");
        countryService.searchStartingWith("Z")
                .forEach(System.out::println);
    }
}

