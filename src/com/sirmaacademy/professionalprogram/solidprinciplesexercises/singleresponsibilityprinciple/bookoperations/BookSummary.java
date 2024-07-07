package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.bookoperations;

import java.util.Arrays;

public class BookSummary {

    public static String getBookSummary(Book book) {
        return String.format("%s by %s", book.getTitle(), Arrays.toString(book.getAuthors()));
    }

}
