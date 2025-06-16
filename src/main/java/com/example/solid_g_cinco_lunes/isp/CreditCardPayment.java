package com.example.solid_g_cinco_lunes.isp;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card: ****" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Holder: " + cardHolder);
        System.out.println("Credit card payment completed successfully!\n");
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}