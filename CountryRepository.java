package com.cognizant.countryquery.repository;
import com.cognizant.countryquery.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Match countries containing text (like search bar)
    List<Country> findByNameContaining(String text);

    // Match countries containing text and sort alphabetically
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Match countries starting with a given letter
    List<Country> findByNameStartingWith(String prefix);
}

