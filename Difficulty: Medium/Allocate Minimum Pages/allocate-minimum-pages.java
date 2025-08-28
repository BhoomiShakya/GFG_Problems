class Solution {
    public int findPages(int[] arr, int k) {
        if (k > arr.length) return -1;
        int low = maxElement(arr);
        int high = sumElement(arr);

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = possible(arr, mid, k); // ✅ fixed semicolon
            if (students <= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int possible(int[] arr, int mid, int k) {
        int pages = 0;
        int students = 1;
        for (int i = 0; i < arr.length; i++) {
            if ((pages + arr[i]) <= mid) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }
        return students;
    }

    public static int maxElement(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(arr[i], maxi);
        }
        return maxi;
    }

    public static int sumElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
