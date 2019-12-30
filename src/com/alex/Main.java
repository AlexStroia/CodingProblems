package com.alex;

public class Main {

    public static void main(String[] args) {
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBstHelperRecursive(tree, target, Double.MAX_VALUE);

    }

    public static int findClosestValueInBstHelperRecursive(BST tree, int target, double closest) {
        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }

        if (target < tree.value && tree.left != null) {
            return findClosestValueInBstHelperRecursive(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBstHelperRecursive(tree.right, target, closest);
        } else {
            return (int) closest;
        }
    }

    public static int findClosestValueInBstHelperIterative(BST tree, int target, double closest) {
        BST current = tree;

        while (current != null) {
            if (Math.abs(target - closest) > Math.abs(target - current.value)) {
                closest = tree.value;
            }

            if (target < tree.value) {
                current = tree.left;
            } else if (target > tree.value && tree.right != null) {
                current = tree.right;
            } else {
                break;
            }
        }
        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }

        if (target < tree.value) {
            return findClosestValueInBstHelperRecursive(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBstHelperRecursive(tree.right, target, closest);
        } else {
            return (int) closest;
        }
    }
}
