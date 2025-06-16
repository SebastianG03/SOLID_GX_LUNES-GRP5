package com.example.solid_g_cinco_lunes.isp;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        if (paymentMethod == null) {
            System.out.println("Error: No payment method configured!");
            return;
        }
        
        System.out.println("=== Payment Processing ===");
        System.out.println("Payment Type: " + paymentMethod.getPaymentType());
        paymentMethod.processPayment(amount);
    }

    public String getCurrentPaymentType() {
        return paymentMethod != null ? paymentMethod.getPaymentType() : "None";
    }
}