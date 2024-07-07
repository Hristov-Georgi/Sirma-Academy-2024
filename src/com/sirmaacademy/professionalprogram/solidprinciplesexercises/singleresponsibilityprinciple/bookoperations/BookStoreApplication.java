package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.bookoperations;

import java.math.BigDecimal;
import java.time.Year;

public class BookStoreApplication {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();

        String[] autorhors = {"J. R. R. Tolkien"};
        Book book = new Book("The Lord of the Rings", autorhors, "Allen & Unwin",
                "English", 1077, Year.of(1954), BigDecimal.valueOf(109));

        bookRepository.saveToDatabase(book);

        System.out.println(BookSummary.getBookSummary(book));
    }

}
