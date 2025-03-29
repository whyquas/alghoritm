/*
 Checks if all digits of a number are the same using recursion.
 Time Complexity: O(log n)
*/

import java.util.Scanner;

class DigitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String s = scanner.next();
        System.out.println("All digits: " + isAllDigits(s, 0));
    }
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
}