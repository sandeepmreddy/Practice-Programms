package DesignPatterns.DecorativePattern;

abstract class LoanDecorator implements Loan {
    protected Loan decoratedLoan;

    public LoanDecorator(Loan loan) {
        this.decoratedLoan = loan;
    }

    @Override
    public String getDescription() {
        return decoratedLoan.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedLoan.getCost();
    }
}
