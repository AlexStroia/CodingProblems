package com.alex;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private static List<Integer> branchSum(BinaryTree tree) {
        List<Integer> sums = new ArrayList<>();
        calculateSums(tree,0,sums);
        return sums;
    }

    private static void calculateSums(BinaryTree node, int runningSum, List<Integer> sums) {
        if(node == null) return;

        int newRunningSum = runningSum + node.value;

        if(node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return;
        }

        calculateSums(node.left, sum, sums);
        calculateSums(node.right,sum,sums);
    }



    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
