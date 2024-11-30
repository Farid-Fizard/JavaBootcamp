package design_pattern.stuructural.facade;

public class CreditScore {


    public int calculatedCreditScore(double income, double debts){
        int baseScore=600;
        int incomeFactor = (int) (income / 100);
        int debtPenalty = (int) (debts / 100);

        int creditScore=baseScore + incomeFactor - debtPenalty;
        System.out.println("Əldə olunan kredit xalı: "+creditScore);
        return creditScore;
    }
}
