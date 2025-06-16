package com.example.solid_g_cinco_lunes.isp;

public class CryptoPayment implements PaymentMethod {
    private String walletAddress;
    private String cryptoType;

    public CryptoPayment(String walletAddress, String cryptoType) {
        this.walletAddress = walletAddress;
        this.cryptoType = cryptoType;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + cryptoType + " payment of $" + amount);
        System.out.println("Wallet: " + walletAddress.substring(0, 8) + "...");
        System.out.println("Crypto payment completed successfully!\n");
    }

    @Override
    public String getPaymentType() {
        return cryptoType + " Cryptocurrency";
    }
}