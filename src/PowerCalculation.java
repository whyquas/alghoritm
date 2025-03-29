import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int n = scanner.nextInt();
        System.out.println("Power: " + power(a, n));
    }
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}