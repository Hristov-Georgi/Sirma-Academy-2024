package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.CardType;
import inheritanceAndInterfaces.inventoryManagementSystem.service.Card;

public class AbstractCard implements Card {

    private final String cardHolderNames;
    private final CardType cardType;
    private final int cardNumber;
    private final int securityCode;

    public AbstractCard(String firstName, String lastName, String cardType, String cardNumber, String securityCode) {
        this.cardHolderNames = setCardHolderName(firstName, lastName);
        this.cardType = setCardType(cardType);
        this.cardNumber = setCardNumber(cardNumber);
        this.securityCode = setCardSecurityCode(securityCode);
    }


    @Override
    public String setCardHolderName(String firstName, String lastName) {

        if (!firstName.isBlank() && !lastName.isBlank()) {
            return String.join(" ", firstName, lastName);
        } else {
            throw new IllegalArgumentException("Invalid transaction!");
        }

    }

    @Override
    public CardType setCardType(String type) {
        String typeToUpperCase = type.toUpperCase();

        if (typeToUpperCase.equals(CardType.VISA.name())) {
            return CardType.VISA;
        } else if (typeToUpperCase.equals(CardType.MASTERCARD.name())) {
            return CardType.MASTERCARD;
        } else {
            throw new IllegalArgumentException("Invalid transaction!");
        }
    }

    @Override
    public int setCardNumber(String cardNumber) {

        if (cardNumber.length() == 16) {
            return Integer.parseInt(cardNumber);

        } else {
            throw new IllegalArgumentException("Invalid transaction!");
        }

    }

    @Override
    public int setCardSecurityCode(String securityCode) {

        if (securityCode.length() == 3) {
            return Integer.parseInt(securityCode);
        } else {
            throw new IllegalArgumentException("Invalid transaction!");
        }

    }

}
