package org.campus02.oop;

public class DemoPaymentApp {
    public static void main(String[] args) {
        // DOGE Payments with 0 transaction fees
        Payment d1 = new CreditcardPayment(5000, "DOGE", "001", "#dogecoin");
        Payment d2 = new CreditcardPayment(10, "DOGE", "002", "#dogecoin");
        Payment d3 = new CreditcardPayment(3000, "DOGE", "003", "#dogecoin");
        Payment d4 = new CreditcardPayment(8000, "DOGE", "004", "#dogecoin");
        Payment d5 = new CreditcardPayment(50_000, "DOGE", "005", "#dogecoin");


        Payment p1 = new CreditcardPayment(1, "USDT", "001", "01");
        Payment p2 = new MaestroPayment(2, "SEK", "002");
        PaymentJournal payments = new PaymentJournal();
        payments.add(d1);
        payments.add(d2);
        payments.add(d3);
        payments.add(d4);
        payments.add(d5);
        payments.add(p1);
        payments.add(p2);

        System.out.println(p2.exchangeToEUR());

        System.out.println(payments.totalTransactionCosts());
        System.out.println(payments.getPaymentsPerCurrency());

    }
}
