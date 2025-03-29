class AverageFinder {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println("Average: " + findAverage(arr, arr.length));
    }
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return ((findAverage(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
    }
}