class MinFinder {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        System.out.println("Minimum: " + findMin(arr, arr.length));
    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
}