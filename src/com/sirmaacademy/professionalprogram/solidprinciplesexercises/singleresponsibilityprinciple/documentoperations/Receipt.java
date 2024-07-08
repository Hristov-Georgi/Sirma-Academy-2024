package com.sirmaacademy.professionalprogram.solidprinciplesexercises.singleresponsibilityprinciple.documentoperations;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Receipt extends Document{
    private static final String INITIAL_SHOPPING_CENTER_NAME = "NO STATIONARY OBJECT";

    private String shoppingCenterName;
    private int idNumber;
    private String operatorFirstName;
    private String operatorLastName;
    private List<Product> productList;
    private BigDecimal totalCost;
    private LocalDateTime publicationDateTime;

    public Receipt(String companyName, String companyAddress, String shoppingCenterName,
                   int idNumber, String operatorFirstName, String operatorLastName,
                   List<Product> productList) {

        super(companyName, companyAddress);

        if (shoppingCenterName == null) {
            this.shoppingCenterName = INITIAL_SHOPPING_CENTER_NAME;
        } else {
            this.shoppingCenterName = shoppingCenterName;
        }

        this.idNumber = idNumber;
        this.operatorFirstName = operatorFirstName;
        this.operatorLastName = operatorLastName;
        this.productList = productList;
        this.totalCost = calculateTotalCost(productList);
        this.publicationDateTime = LocalDateTime.now();
    }

    public String getShoppingCenterName() {
        return shoppingCenterName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getOperatorFirstName() {
        return operatorFirstName;
    }

    public String getOperatorLastName() {
        return operatorLastName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public LocalDateTime getPublicationDateTime() {
        return publicationDateTime;
    }

    private BigDecimal calculateTotalCost(List<Product> productList) {
        BigDecimal value = new BigDecimal(0);

        for (Product p : productList) {
            value = value.add(p.getValue());
        }

        return value;
    }

    @Override
    public void print() {
        //TODO: implement according requirements.
    }

}
