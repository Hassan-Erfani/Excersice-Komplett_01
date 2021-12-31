package org.campus02.oop;

public class MaestroPayment extends Payment{
    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    public double calcTransactionCosts() {
        if(getCurrency().equals("DOGE")) {
            return 0;
        } else if ( (getAmount() * 0.75) > 0.95 ) {
            return getAmount() * 0.75;
        }
        return 0.95;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                "Amount='" + getAmount() + '\'' +
                "Currency='" + getCurrency() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
