package Arrays.Misc;

public class PowerOfX {

    // Recursive method to calculate power
    public static double power(double x, int n) {
        // Base case: anything raised to power 0 is 1
        if (n == 0) {
            return 1;
        }

        // If the power is negative
        if (n < 0) {
            return 1 / power(x, -n);
        }

        // Recursive step
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 5;

        double result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}
