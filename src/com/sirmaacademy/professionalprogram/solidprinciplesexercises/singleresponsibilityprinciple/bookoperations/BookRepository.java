package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.bookoperations;

public class BookRepository {

    public BookRepository() {
    }

    public void saveToDatabase(Book book) {
        System.out.println("Book was saved to database.");
    }

}
