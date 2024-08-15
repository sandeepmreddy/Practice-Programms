package DesignPatterns.BuliderPattern;

public class LoanBuilderExample {
    public static void main(String[] args) {
        // Building a Loan object with only required parameters
        Loan basicLoan = new Loan.LoanBuilder(500000, 5.5, 15).build();
        System.out.println(basicLoan);

        // Building a Loan object with all parameters
        Loan advancedLoan = new Loan.LoanBuilder(1000000, 4.5, 20)
                            .setBorrowerName("John Doe")
                            .setLoanType("Home Loan")
                            .setSecured(true)
                            .build();
        System.out.println(advancedLoan);
    }
}
