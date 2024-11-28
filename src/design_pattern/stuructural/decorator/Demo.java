package design_pattern.stuructural.decorator;

public class Demo {
    public static void main(String[] args) {
        BankAccount account=new BasicBankAccount(2500);
        SMSNotificationDecorator smsNotificationDecorator = new SMSNotificationDecorator(account);
        TransactionFeeDecorator transactionFeeDecorator= new TransactionFeeDecorator(smsNotificationDecorator);
        transactionFeeDecorator.withdraw(1400);

    }
}
