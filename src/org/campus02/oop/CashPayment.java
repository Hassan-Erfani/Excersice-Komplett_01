package org.campus02.oop;

public class CashPayment extends Payment{
    private String name;

    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }

    public CashPayment(String person, double amount, String currency) {
        super(amount, currency);
        this.name = person;
    }

    public double calcTransactionCosts() {
        if (this.name.isEmpty()) {
            return 2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                "Amount='" + getAmount() + '\'' +
                "Currency='" + getCurrency() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
