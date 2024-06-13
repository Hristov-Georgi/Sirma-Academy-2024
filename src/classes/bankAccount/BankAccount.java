package classes.bankAccount;

public class BankAccount {
    private static int INITIAL_ID_VALUE = 1;
    private static final double DEFAULT_INTEREST_RATE = 0.02;

    private int id = INITIAL_ID_VALUE;
    private double balance;
    private double interestRate = DEFAULT_INTEREST_RATE;

    public BankAccount() {
        INITIAL_ID_VALUE++;
    }

    public int getId() {
        return id;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return interestRate * years;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}
