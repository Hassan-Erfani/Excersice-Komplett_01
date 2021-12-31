package org.campus02.oop;

public abstract class Payment {
    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract double calcTransactionCosts();

    public double exchangeToEUR() {
        double res;
        switch (this.currency) {
            case "Doge":
                res = this.amount * 1;
                break;
            case "USDT":
                res = this.amount * 1.10;
                break;
            case "GBP":
                res = this.amount * 0.85;
                break;
            case "SEK":
                res = this.amount * 9.50;
                break;
            case "HUF":
                res = this.amount * 310;
                break;
            default:
                res = this.amount * 2;
                break;
        }
        return res;
    }

    public String getCurrency() {
        return this.currency;
    }

    public double getAmount() {
        return this.amount;
    }
}
