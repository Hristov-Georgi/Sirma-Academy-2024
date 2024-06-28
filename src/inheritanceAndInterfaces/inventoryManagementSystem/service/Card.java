package inheritanceAndInterfaces.inventoryManagementSystem.service;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.CardType;

public interface Card {

    String setCardHolderName(String firstName, String lastName);
    CardType setCardType(String type);
    int setCardNumber(String cardNumber);
    int setCardSecurityCode(String securityCode);
}
