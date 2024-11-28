package design_pattern.stuructural.decorator;

public abstract class BankAccountDecorator implements BankAccount {
    protected BankAccount decoratedAccount;

    public BankAccountDecorator(BankAccount account) {
        this.decoratedAccount = account;
    }

    @Override
    public void withdraw(double amount) {
        decoratedAccount.withdraw(amount);
    }
}
