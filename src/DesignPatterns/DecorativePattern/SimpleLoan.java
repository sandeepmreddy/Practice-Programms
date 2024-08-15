package DesignPatterns.DecorativePattern;

class SimpleLoan implements Loan {
    @Override
    public String getDescription() {
        return "Simple Loan";
    }

    @Override
    public double getCost() {
        return 10000.00; // Base amount for a simple loan
    }
}
