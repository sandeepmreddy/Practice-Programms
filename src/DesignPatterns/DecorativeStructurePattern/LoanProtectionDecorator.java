package DesignPatterns.DecorativeStructurePattern;

class LoanProtectionDecorator extends LoanDecorator {

    public LoanProtectionDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public String getDescription() {
        return decoratedLoan.getDescription() + ", with Loan Protection Plan";
    }

    @Override
    public double getCost() {
        return decoratedLoan.getCost() + 250.00;
    }
}
