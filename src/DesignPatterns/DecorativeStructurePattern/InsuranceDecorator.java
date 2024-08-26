package DesignPatterns.DecorativeStructurePattern;

class InsuranceDecorator extends LoanDecorator {

    public InsuranceDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public String getDescription() {

        return decoratedLoan.getDescription() + ", with Insurance";
    }

    @Override
    public double getCost() {

        return decoratedLoan.getCost() + 500.00;
    }
}
