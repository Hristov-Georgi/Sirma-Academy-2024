package com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service.implementation;

/**
 * Creates single card used to make orders. Can be extended.
 */

public class CardClass extends AbstractCard{

    public CardClass(String names, String cardType, String cardNumber, String securityCode) {
        super(names, cardType, cardNumber, securityCode);
    }
}
