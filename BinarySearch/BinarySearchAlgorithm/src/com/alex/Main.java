package com.alex;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 22};
        int target = 3;

        System.out.println(binarySearch(arr, target));
    }


    private static int binarySearch(int[] arr, int target) {
        return binarySearch2(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {//edge case when the num is not found
            return -1;
        }

        int middle = (left + right) / 2;
        int potentialMatch = arr[middle];

        if (potentialMatch == target) {
            return middle;
        } else if (target < potentialMatch) {
            return binarySearch(arr, target, left, middle - 1);
        } else {
            return binarySearch(arr, target, middle + 1, right);
        }
    }

    private static int binarySearch2(int[] arr, int target, int left, int right) {

        while (left <= right) {
            int middle = (left + right) / 2;
            int potentialMatch = arr[middle];

            if (potentialMatch == target) {
                return middle;
            } else if (target < potentialMatch) {
                right = middle -1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
