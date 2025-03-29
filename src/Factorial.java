/*
 Computes the factorial of a number recursively.
 Time Complexity: O(n)
*/

import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial: " + factorial(n));
    }
    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
}