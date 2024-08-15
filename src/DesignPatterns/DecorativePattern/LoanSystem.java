package DesignPatterns.DecorativePattern;

public class LoanSystem {
    public static void main(String[] args) {
        Loan loan = new SimpleLoan();
        System.out.println(loan.getDescription() + " $" + loan.getCost());

        loan = new InsuranceDecorator(loan);
        System.out.println(loan.getDescription() + " $" + loan.getCost());

        loan = new PrepaymentOptionDecorator(loan);
        System.out.println(loan.getDescription() + " $" + loan.getCost());

        loan = new LoanProtectionDecorator(loan);
        System.out.println(loan.getDescription() + " $" + loan.getCost());
    }
}
