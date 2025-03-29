/*
 Reverses an array using recursion.
 Time Complexity: O(n)
*/

import java.util.Scanner;

class ArrayReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        reverseArray(arr, 0, n - 1);
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
}