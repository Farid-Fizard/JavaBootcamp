package design_pattern.stuructural.facade;

public class EligibilityClass {

    public boolean eligibilityCheck(double income,double debts, int employmentMonths) {
        if (income < 3000) {
            System.out.println("Gəlir məbləği çox aşağıdır.");
            return false;
        }
        if (debts > income * 0.5) {
            System.out.println("Borc miqdarı həddindən artıqdır.");
            return false;
        }
        if (employmentMonths < 12) {
            System.out.println("İşləmə müddəti çox azdır. Müraciət üçün minimum işçi müddəti 12 ay olmalıdır.");
            return false;
        }
        System.out.println("Müraciət üçün uyğundur");
        return true;
    }
}
