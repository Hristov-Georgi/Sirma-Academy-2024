package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.documentoperations;

public abstract class Document implements PrintDocument{

    private String companyName;
    private String companyAddress;

    public Document(String companyName, String companyAddress) {

        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

}
