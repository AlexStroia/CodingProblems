package com.alex;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] input = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;

        threeNumberSum(input,target);
    }

    //O(n^3)
//    private static List<Integer[]> threeNumberSum(int[] input, int target) {
//
//        List<Integer[]> nums = new ArrayList<>();
//        for (int i = 0; i < input.length; i++) {
//            for (int j = i + 1; j < input.length; j++) {
//                for (int k = j + 1; k < input.length - 1; k++) {
//                    int potentialMatch = input[i] + input[j] + input[k];
//                    if (potentialMatch == target) {
//                        Integer[] triplets = new Integer[]{input[i], input[j], input[k]};
//                        nums.add(triplets);
//                    }
//                }
//            }
//        }
//        return nums;
//    }

    //O(n^2)
//    private static List<Integer[]> threeNumberSum(int[] input, int target) {
//
//        List<Integer[]> nums = new ArrayList<>();
//        for (int i = 0; i < input.length; i++) {
//            for (int j = i + 1; j < input.length - 2; j++) {
//                int potentialMatch = input[i] + input[j] + input[j + 1];
//                if (potentialMatch == target) {
//                    Integer[] triplets = new Integer[]{input[i], input[j], input[j + 1]};
//                    nums.add(triplets);
//                }
//            }
//        }
//        return nums;
//    }

    private static List<Integer[]> threeNumberSum(int[] input, int target) {
        Arrays.sort(input);
        List<Integer[]> nums = new ArrayList<>();
        for (int i = 0; i < input.length - 2; i++) {
            int start = i + 1;
            int end = input.length - 1;

            while (start < end) {
                int potentialMatch = input[i] + input[start] + input[end];
                if (potentialMatch < target) {
                    start++;
                } else if (potentialMatch > target) {
                    end--;
                } else {
                    nums.add(new Integer[]{input[start], input[i], input[end]});
                    start++;
                    end--;
                }
            }
        }
        return nums;
    }
}
