package com.sms.service;

import com.sms.repository.BookRepository;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookDetails() {
        List<String> books = bookRepository.getAllBooks();
        System.out.println(" Welcome to the Library Management System");
        System.out.println("Total number of books available: " + books.size());

        for (String book : books) {
            System.out.println("- \"" + book + "\" is available in our collection.");
        }
    }
}
