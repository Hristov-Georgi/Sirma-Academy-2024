package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.CardType;
import inheritanceAndInterfaces.inventoryManagementSystem.service.Card;

/**
 * Creates card object to provide orders payment.
 * Validate input data upon card creation.
 */

public class AbstractCard implements Card {

    private final String cardHolderNames;
    private final CardType cardType;
    private final long cardNumber;
    private final int securityCode;

    public AbstractCard(String names, String cardType, String cardNumber, String securityCode) {
        this.cardHolderNames = setCardHolderName(names);
        this.cardType = setCardType(cardType);
        this.cardNumber = setCardNumber(cardNumber);
        this.securityCode = setCardSecurityCode(securityCode);
    }


    @Override
    public String setCardHolderName(String names) {

        String[] firstLastName = names.split("\\s+");

        if (!firstLastName[0].isBlank() ||
            !firstLastName[1].isBlank() ||
            firstLastName[0].length() > 1 ||
            firstLastName[1].length() > 1) {

            return names;

        } else {
            throw new IllegalArgumentException("Invalid names!");
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
            throw new IllegalArgumentException("Invalid card type!");
        }
    }

    @Override
    public long setCardNumber(String cardNumber) {

        if (cardNumber.length() == 16) {
            return Long.parseLong(cardNumber);

        } else {
            throw new IllegalArgumentException("Invalid card number!");
        }

    }

    @Override
    public int setCardSecurityCode(String securityCode) {

        if (securityCode.length() == 3) {
            return Integer.parseInt(securityCode);
        } else {
            throw new IllegalArgumentException("Invalid security code!");
        }

    }

}
