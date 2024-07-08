package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.documentoperations;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice extends Document{

    private int postcode;
    private String country;
    private String email;
    private int phoneNumber;

    private int invoiceNumber;
    private int VATNumber;
    private LocalDate issueDate;
    private LocalDate endDate;
    private BigDecimal amount;

    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;

    public Invoice(String companyName, String companyAddress, int postcode, String country,
                   String email, int phoneNumber, int invoiceNumber, int VATNumber,
                   LocalDate endDate, BigDecimal amount, String customerFirstName,
                   String customerLastName, String customerAddress) {

        super(companyName, companyAddress);
        this.postcode = postcode;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.invoiceNumber = invoiceNumber;
        this.VATNumber = VATNumber;
        this.issueDate = LocalDate.now();
        this.endDate = endDate;
        this.amount = amount;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getVATNumber() {
        return VATNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    @Override
    public void print() {

        String.format(
                "INVOICE %n%n" +
                        "Company name: %s%n" +
                        "Address: %s%n" +
                        "Postcode: %d%n" +
                        "Country: %s%n" +
                        "Email: %s%n" +
                        "Phone number: %d%n" +
                        "%n%n" +
                        "Invoice information:                                       Recipient information: %n" +
                        "Invoice number: %d                                         Customer names: %s %s%n" +
                        "VAT number: %d                                             Address: %s%n" +
                        "Date of issue: %s%n" +
                        "End date: %s%n" +
                        "Amount: %s%n",
                super.getCompanyName(), super.getCompanyAddress(), this.postcode, this.country,
                this.email, this.phoneNumber, this.invoiceNumber, this.customerFirstName,
                this.customerLastName, this.VATNumber, this.customerAddress,
                this.issueDate, this.endDate, this.amount);

    }

}
