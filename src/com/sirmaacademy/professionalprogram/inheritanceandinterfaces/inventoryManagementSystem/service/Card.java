package com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service;

import com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.enums.CardType;

public interface Card {

    String setCardHolderName(String names);
    CardType setCardType(String type);
    long setCardNumber(String cardNumber);
    int setCardSecurityCode(String securityCode);
}
