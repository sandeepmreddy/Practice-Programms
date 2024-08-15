package DesignPatterns.DecorativePattern;

class PrepaymentOptionDecorator extends LoanDecorator {

    public PrepaymentOptionDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public String getDescription() {
        return decoratedLoan.getDescription() + ", with Prepayment Option";
    }

    @Override
    public double getCost() {
        return decoratedLoan.getCost() + 300.00;
    }
}
