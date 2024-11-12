package DesignPatterns;

import java.util.HashMap;
import java.util.Map;

// Flyweight class (intrinsic state)
class LoanType {
    private String type;     // e.g., "Home Loan", "Car Loan", "Personal Loan"
    private String terms;    // e.g., "15 years", "5 years", etc.
    private double interestRate;  // Interest rate applicable to the loan type

    public LoanType(String type, String terms, double interestRate) {
        this.type = type;
        this.terms = terms;
        this.interestRate = interestRate;
    }

    public void displayLoanDetails(String customerName, double loanAmount) {
        System.out.println("Loan Type: " + type + ", Terms: " + terms + ", Interest Rate: " + interestRate 
            + "%, Loan Amount for " + customerName + ": $" + loanAmount);
    }
}

// Flyweight Factory
class LoanFactory {
    private static Map<String, LoanType> loanTypes = new HashMap<>();

    public static LoanType getLoanType(String type, String terms, double interestRate) {
        String key = type + "_" + terms + "_" + interestRate;
        LoanType loanType = loanTypes.get(key);
        if (loanType == null) {
            loanType = new LoanType(type, terms, interestRate);
            loanTypes.put(key, loanType);
        }
        return loanType;
    }
}

// Context class (extrinsic state)
class Loan {
    private String customerName;
    private double loanAmount;
    private LoanType loanType;

    public Loan(String customerName, double loanAmount, LoanType loanType) {
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.loanType = loanType;
    }

    public void displayLoan() {
        loanType.displayLoanDetails(customerName, loanAmount);
    }
}

// Client class
public class FlyweightLoanExample {
    public static void main(String[] args) {
        // Creating the flyweight objects
        LoanFactory loanFactory = new LoanFactory();

        // Using the Flyweight pattern to reuse LoanType objects
        Loan loan1 = new Loan("John Doe", 500000, loanFactory.getLoanType("Home Loan", "15 years", 4.5));
        Loan loan2 = new Loan("Jane Doe", 20000, loanFactory.getLoanType("Car Loan", "5 years", 7.0));
        Loan loan3 = new Loan("Sam Smith", 300000, loanFactory.getLoanType("Home Loan", "15 years", 4.5)); // Reuses Home Loan Type

        // Displaying loans
        loan1.displayLoan();
        loan2.displayLoan();
        loan3.displayLoan();
    }
}
