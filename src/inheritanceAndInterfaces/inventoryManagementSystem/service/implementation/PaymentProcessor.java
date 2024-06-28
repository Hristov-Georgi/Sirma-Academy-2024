package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.service.Card;

import java.math.BigDecimal;

public class PaymentProcessor {

    private long orderId;
    private BigDecimal orderPrice;
    private Card card;

    public PaymentProcessor(long orderId, BigDecimal orderPrice, Card card) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.card = card;
    }

    public boolean validatePayment(){

        if (this.orderPrice != null && orderId != 0 && card != null) {
            return true;
        }
        return false;
    }

}
