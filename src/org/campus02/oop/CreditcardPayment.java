package org.campus02.oop;

public class CreditcardPayment extends Payment{
    private String cardNumber;
    private String securityCode;

    public CreditcardPayment(double amount, String currency, String cardNumber, String securityCode) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    public double calcTransactionCosts() {
        if(getCurrency().equals("DOGE")) {
            return 0;
        }
        if (!getCurrency().equals("EUR")) {
            return 1.5 + getAmount() * 2.75;
        } else {
            return 0.5 + getAmount() * 1.1;
        }
    }

    @Override
    public String toString() {
        return "CreditcardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", Amount='" + getAmount() + '\'' +
                ", Currency='" + getCurrency() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
