package design_pattern.stuructural.decorator;

public class SMSNotificationDecorator extends BankAccountDecorator{

    public SMSNotificationDecorator(BankAccount account) {
        super(account);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        sendSMS(amount);
    }

    private void sendSMS(double amount) {
        System.out.println("SMS: Balansınızdan "+amount+" AZN  çıxıldı.");
    }
}
