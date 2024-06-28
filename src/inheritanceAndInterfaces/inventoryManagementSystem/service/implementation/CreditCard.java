package inheritanceAndInterfaces.inventoryManagementSystem.service.implementation;

public class CreditCard extends AbstractCard{

    public CreditCard(String firstName, String lastName, String cardType, String cardNumber, String securityCode) {
        super(firstName, lastName, cardType, cardNumber, securityCode);
    }

}
