package com.example.solid_g_cinco_lunes.isp;

public class BankTransferPayment implements PaymentMethod {
    private String bankAccount;
    private String bankName;

    public BankTransferPayment(String bankAccount, String bankName) {
        this.bankAccount = bankAccount;
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
        System.out.println("Bank: " + bankName);
        System.out.println("Account: ****" + bankAccount.substring(bankAccount.length() - 4));
        System.out.println("Bank transfer payment completed successfully!\n");
    }

    @Override
    public String getPaymentType() {
        return "Bank Transfer";
    }
}
