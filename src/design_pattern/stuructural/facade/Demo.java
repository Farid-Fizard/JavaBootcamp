package design_pattern.stuructural.facade;

public class Demo {
    public static void main(String[] args) {

        LoanApplicationFacade loanApplicationFacade= new LoanApplicationFacade();

       //istifadəçi məlumatları
        double income = 5000;
        double debts = 2000;
        int employmentMonths = 15;
        double requestedAmount = 7000;
        int repaymentMonths = 24;

        boolean isLoanApproved = loanApplicationFacade.applyForLoan(income, debts, employmentMonths, requestedAmount, repaymentMonths);

        if (isLoanApproved) {
            System.out.println("Müraciət təsdiqləndi!");
        } else {
            System.out.println("Müraciət ləğv edildi.");
        }
    }
}
