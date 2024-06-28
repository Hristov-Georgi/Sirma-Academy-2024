package inheritanceAndInterfaces.inventoryManagementSystem.service;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.CardType;

public interface Card {

    String setCardHolderName(String names);
    CardType setCardType(String type);
    long setCardNumber(String cardNumber);
    int setCardSecurityCode(String securityCode);
}
