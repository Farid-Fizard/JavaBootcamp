package design_pattern.stuructural.adapter;

public class Demo {
    public static void main(String[] args) {
        LocalPaymentSystem payment= new LocalPaymentSystem();
        payment.makePayment(350);

        PaymentAdapter paymentAdapter= new PaymentAdapter(payment);
        paymentAdapter.paymentInUSD(750);
        paymentAdapter.paymentInRUB(15000);
        paymentAdapter.paymentInTL(3500);

    }
}
