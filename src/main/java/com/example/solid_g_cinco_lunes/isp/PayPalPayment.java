package com.example.solid_g_cinco_lunes.isp;

public class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("PayPal account: " + email);
        System.out.println("PayPal payment completed successfully!\n");
    }

    @Override
    public String getPaymentType() {
        return "PayPal";
    }
}
