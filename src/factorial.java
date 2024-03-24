public class factorial {
    // Recursive method to calculate factorial
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        factorial fact = new factorial();
        System.out.println("Factorial of 5 is: " + fact.factorial(5));
    }
}

