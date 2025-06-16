package com.example.solid_g_cinco_lunes.isp;

public class PaymentMethodFactory {
    public static PaymentMethod createCreditCard(String cardNumber, String cardHolder) {
        return new CreditCardPayment(cardNumber, cardHolder);
    }

    public static PaymentMethod createPayPal(String email) {
        return new PayPalPayment(email);
    }

    public static PaymentMethod createCrypto(String walletAddress, String cryptoType) {
        return new CryptoPayment(walletAddress, cryptoType);
    }

    public static PaymentMethod createBankTransfer(String bankAccount, String bankName) {
        return new BankTransferPayment(bankAccount, bankName);
    }
}