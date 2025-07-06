package com.sms.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> getAllBooks() {
        return Arrays.asList("The Alchemist", "Spring in Action", "Clean Code", "Java: The Complete Reference");
    }
}
