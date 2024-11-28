package design_pattern.stuructural.decorator;

public class BasicBankAccount implements BankAccount {
    private double balance;

    public BasicBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount){
            balance-=amount;
            System.out.println("Balansdan "+amount+ " AZN çıxarıldı. Geriyə qalan balans: "+balance);
        }
        else{
            System.out.println("Əməliyyat üçün balansınızda kifayət qədər vəsait yoxdur");
        }
    }

    public double getBalance() {
        return balance;
    }
}
