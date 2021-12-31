package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {
    private ArrayList<Payment> payments = new ArrayList<>();

    public void add(Payment p) {
        payments.add(p);
    }

    public ArrayList<Double> totalTransactionCosts() {
        ArrayList<Double> res = new ArrayList<>();
        for (Payment payment : payments) {
            res.add(payment.calcTransactionCosts());
        }
        return res;
    }

   public HashMap<String, Double> getPaymentsPerCurrency() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("DOGE", 0.0);
        map.put("USDT", 0.0);
        map.put("GBP", 0.0);
        map.put("SEK", 0.0);
        map.put("HUF", 0.0);
        map.put("REST", 0.0);

        for (Payment payment : payments) {
            switch (payment.getCurrency()) {
                case "DOGE":
                    map.put("DOGE", map.get("DOGE") + 1);
                    break;
                case "USD":
                    map.put("USD", map.get("USD") + 1);
                    break;
                case "GBP":
                    map.put("GBP", map.get("GBP") + 1);
                    break;
                case "SEK":
                    map.put("SEK", map.get("SEK") + 1);
                    break;
                case "HUF":
                    map.put("HUF", map.get("HUF") + 1);
                    break;
                default:
                    map.put("REST", map.get("REST") +1);
                break;
            }
        }
        return map;
    }

    @Override
    public String toString() {
        return "PaymentJournal{" +
                "payments=" + payments +
                '}';
    }
}
