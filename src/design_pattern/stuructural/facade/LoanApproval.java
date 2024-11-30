package design_pattern.stuructural.facade;

public class LoanApproval {
    public boolean approveLoan(double requestedAmount, double income, int repaymentMonths){
        double maxLoanAmount = income * 10;
        if(requestedAmount>maxLoanAmount){
            System.out.println("Kredit üçün müraciət edilən məbləğ limitin üzərindədir.");
            return false;
        }

        double interestRate = 0.05; // %5 faiz
        double monthlyPayment = calculateMonthlyPayment(requestedAmount, interestRate, repaymentMonths);

        if (monthlyPayment > income * 0.4) {
            System.out.println("Aylıq ödəmə miqdarı müştərinin maaşı üçün həddindən artıqdır.");
            return false;
        }

        //System.out.println("Müraciət təsdiqləndi!");
        return true;

    }
    private double calculateMonthlyPayment(double loanAmount, double interestRate, int months) {
        return (loanAmount * (1 + interestRate)) / months;
    }
}
