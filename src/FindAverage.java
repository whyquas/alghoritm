/*
 Computes the average of an array recursively.
 Time Complexity: O(n)
*/

import java.util.Scanner;

class AverageFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println("Average: " + findAverage(arr, n));
    }
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return ((findAverage(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
    }
}