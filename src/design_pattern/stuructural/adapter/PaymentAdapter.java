package design_pattern.stuructural.adapter;

public class PaymentAdapter implements AdvancedPaymentSystem {
    private LocalPaymentSystem localPaymentSystem= new LocalPaymentSystem();

    public PaymentAdapter(LocalPaymentSystem localPaymentSystem) {
        this.localPaymentSystem = localPaymentSystem;
    }

    @Override
    public void paymentInUSD(double amountInUSD) {
        double exchangeRate=1.7;
        double amountInAZN= exchangeRate*amountInUSD;
        localPaymentSystem.makePayment(amountInAZN);

    }

    @Override
    public void paymentInRUB(double amountInRUB) {
        double exchangeRate=0.016;
        double amountInAZN= exchangeRate*amountInRUB;
        localPaymentSystem.makePayment(amountInAZN);

    }

    @Override
    public void paymentInTL(double amountInTL) {
        double exchangeRate=0.049;
        double amountInAZN= exchangeRate*amountInTL;
        localPaymentSystem.makePayment(amountInAZN);
    }
}
