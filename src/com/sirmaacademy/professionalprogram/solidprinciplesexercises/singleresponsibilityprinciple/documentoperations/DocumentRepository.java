package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.documentoperations;

public class DocumentRepository {

    public DocumentRepository() {
    }

    public void save(Document document) {
        System.out.println("Document successfully saved to db.");
    }

}
