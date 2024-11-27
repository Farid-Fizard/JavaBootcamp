package design_pattern.stuructural.adapter;

public interface AdvancedPaymentSystem {
    public void paymentInUSD(double amountInUSD);
    public void paymentInRUB(double amountInRUB);
    public void paymentInTL(double amountInTL);
}
