package design_pattern.stuructural.decorator;

public class TransactionFeeDecorator extends BankAccountDecorator{
    private  static final double TRANSACTION_FEE=5.0;
    public TransactionFeeDecorator(BankAccount account) {
        super(account);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+TRANSACTION_FEE);
        System.out.println("Köçürmə əməliyyatı üzrə balansdan  "+ TRANSACTION_FEE +" AZN çıxıldı");
    }
}
