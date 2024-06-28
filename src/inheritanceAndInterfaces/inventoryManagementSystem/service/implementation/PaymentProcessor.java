package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.service.Card;

import java.math.BigDecimal;

public class PaymentProcessor {

    private long orderNumber;
    private BigDecimal orderPrice;
    private Card card;

    public PaymentProcessor(long orderId, BigDecimal orderPrice, Card card) {
        this.orderNumber = orderId;
        this.orderPrice = orderPrice;
        this.card = card;
    }

    public boolean validatePayment(){

        if (this.orderPrice != null && orderNumber != 0 && card != null) {
            return true;
        }
        return false;
    }

}
