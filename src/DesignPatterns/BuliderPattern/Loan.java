package DesignPatterns.BuliderPattern;

public class Loan {
    // Required parameters
    private final double principal;
    private final double interestRate;
    private final int tenure; // in years

    // Optional parameters
    private final String borrowerName;
    private final String loanType;
    private final boolean isSecured;

    private Loan(LoanBuilder builder) {
        this.principal = builder.principal;
        this.interestRate = builder.interestRate;
        this.tenure = builder.tenure;
        this.borrowerName = builder.borrowerName;
        this.loanType = builder.loanType;
        this.isSecured = builder.isSecured;
    }

    @Override
    public String toString() {
        return "Loan [Principal=" + principal + ", Interest Rate=" + interestRate + "%, Tenure=" + tenure + " years" +
                ", Borrower Name=" + (borrowerName != null ? borrowerName : "N/A") +
                ", Loan Type=" + (loanType != null ? loanType : "N/A") +
                ", Secured=" + isSecured + "]";
    }

    // Static inner Builder class
    public static class LoanBuilder {
        // Required parameters
        private final double principal;
        private final double interestRate;
        private final int tenure;

        // Optional parameters - initialized to default values
        private String borrowerName = null;
        private String loanType = null;
        private boolean isSecured = false;

        public LoanBuilder(double principal, double interestRate, int tenure) {
            this.principal = principal;
            this.interestRate = interestRate;
            this.tenure = tenure;
        }

        public LoanBuilder setBorrowerName(String borrowerName) {
            this.borrowerName = borrowerName;
            return this;
        }

        public LoanBuilder setLoanType(String loanType) {
            this.loanType = loanType;
            return this;
        }

        public LoanBuilder setSecured(boolean isSecured) {
            this.isSecured = isSecured;
            return this;
        }

        public Loan build() {
            return new Loan(this);
        }
    }
}
