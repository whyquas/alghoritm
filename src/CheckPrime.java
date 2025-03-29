class PrimeChecker {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(n + " is prime: " + isPrime(n, n - 1));
    }
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor - 1);
    }
}