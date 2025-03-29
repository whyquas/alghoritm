class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial: " + factorial(n));
    }
    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
}