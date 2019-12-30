package com.alex;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] input = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] input2 = {12, 3, 1, 2, -6, 5, -8, 6};
        int target = 10;
        int target2 = 0;

        List<Integer[]> nums = threeNumberSum(input, target);


        for (Integer[] num : nums) {
            System.out.println("Yo");
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
            }

        }
    }


    private static int[] TwoNumberSum(int[] input, int target) {
        Map<Integer, Boolean> storedNums = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int potentialMatch = target - input[i];

            if (storedNums.containsKey(potentialMatch)) {
                return new int[]{potentialMatch, input[i]};
            } else {
                storedNums.put(input[i], true);
            }
        }
        return new int[]{0};
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
