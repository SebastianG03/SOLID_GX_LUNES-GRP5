package com.example.solid_g_cinco_lunes.isp;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PAGOS - APLICACIÓN DEL PRINCIPIO DIP ===\n");

        PaymentMethod creditCard = PaymentMethodFactory.createCreditCard("1234567890123456", "John Doe");
        PaymentMethod paypal = PaymentMethodFactory.createPayPal("john.doe@example.com");
        PaymentMethod bitcoin = PaymentMethodFactory.createCrypto("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", "Bitcoin");
        PaymentMethod bankTransfer = PaymentMethodFactory.createBankTransfer("9876543210", "Global Bank");

        double[] amounts = {150.0, 89.99, 500.0, 1250.75};
        PaymentMethod[] methods = {creditCard, paypal, bitcoin, bankTransfer};
        String[] descriptions = {"Online Purchase", "Subscription Payment", "Investment", "Rent Payment"};

        for (int i = 0; i < methods.length; i++) {
            System.out.println("--- Transaction " + (i + 1) + ": " + descriptions[i] + " ---");
            
            PaymentProcessor processor = new PaymentProcessor(methods[i]);
            processor.makePayment(amounts[i]);
        }

        System.out.println("=== DEMOSTRACIÓN DE CAMBIO DE MÉTODO DE PAGO ===\n");
        
        PaymentProcessor flexibleProcessor = new PaymentProcessor(creditCard);
        
        System.out.println("--- Initial Payment Method ---");
        System.out.println("Current method: " + flexibleProcessor.getCurrentPaymentType());
        flexibleProcessor.makePayment(25.99);
        
        System.out.println("--- Changing Payment Method ---");
        flexibleProcessor.setPaymentMethod(paypal);
        System.out.println("New method: " + flexibleProcessor.getCurrentPaymentType());
        flexibleProcessor.makePayment(75.50);

        System.out.println("--- Changing to Crypto ---");
        flexibleProcessor.setPaymentMethod(bitcoin);
        System.out.println("New method: " + flexibleProcessor.getCurrentPaymentType());
        flexibleProcessor.makePayment(199.99);

        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===\n");
        
        PaymentMethod[] allMethods = {
            new CreditCardPayment("4111111111111111", "Alice Smith"),
            new PayPalPayment("alice@example.com"),
            new CryptoPayment("bc1qxy2kgdygjrsqtzq2n0yrf2493p83kkfjhx0wlh", "Ethereum"),
            new BankTransferPayment("1122334455", "Tech Credit Union")
        };

        for (PaymentMethod method : allMethods) {
            PaymentProcessor processor = new PaymentProcessor(method);
            processor.makePayment(99.99);
        }

        System.out.println("=== MANEJO DE ERRORES ===\n");
        
        PaymentProcessor nullProcessor = new PaymentProcessor(null);
        nullProcessor.makePayment(100.0);
    }
}