import java.util.*;

class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        ArrayList<int[]> list = new ArrayList<>();

        // Step 1: Sort intervals based on starting point
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        // Step 2: Initialize with the first interval
        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                // Overlapping interval, merge it
                end = Math.max(end, arr[i][1]);
            } else {
                // No overlap, add the current merged interval
                list.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Add the last interval
        list.add(new int[]{start, end});
        return list;
    }
}
