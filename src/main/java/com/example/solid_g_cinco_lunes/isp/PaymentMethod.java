package com.example.solid_g_cinco_lunes.isp;

public interface PaymentMethod {
    void processPayment(double amount);
    String getPaymentType();
}