package com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service.implementation;

import com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service.Card;

import java.math.BigDecimal;

/**
 * Validates if payment is eligible or not.
 */

public class PaymentProcessor {

    private long orderNumber;
    private BigDecimal orderPrice;
    private Card card;

    public PaymentProcessor(long orderId, BigDecimal orderPrice, Card card) {
        this.orderNumber = orderId;
        this.orderPrice = orderPrice;
        this.card = card;
    }

    /**
     * Return true if payment is eligible otherwise return false.
     */

    public boolean validatePayment(){

        if (this.orderPrice != null && orderNumber != 0 && card != null) {
            return true;
        }
        return false;
    }

}
