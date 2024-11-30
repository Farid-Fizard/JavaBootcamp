package design_pattern.stuructural.facade;

public class LoanApplicationFacade {
    private final EligibilityClass eligibilityClass;
    private final CreditScore creditScore;
    private final LoanApproval loanApproval;

    public LoanApplicationFacade() {
        this.eligibilityClass = new EligibilityClass();
        this.creditScore = new CreditScore();
        this.loanApproval = new LoanApproval();
    }
    public boolean applyForLoan(double income, double debts, int employmentMonths, double requestedAmount, int repaymentMonths) {
        boolean isEligible= eligibilityClass.eligibilityCheck(income,debts,employmentMonths);
        if(!isEligible){
            return false;
        }
        int finalCreditScore= creditScore.calculatedCreditScore(income,debts);
        if (finalCreditScore<625){
            return false;
        }
        boolean isApproved= loanApproval.approveLoan(requestedAmount, income, repaymentMonths);
        if (!isApproved){
            return false;
        }
        return isApproved;
    }
}
