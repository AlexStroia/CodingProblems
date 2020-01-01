package com.alex;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);
        System.out.println(getNthFib(4));
    }

//    public static int getNthFib(int n) {
//        if(n == 2) return 1;
//        else if(n==1) return 0;
//        return getNthFib(n-1) + getNthFib(n-2);
//    }

//    private static int getNthFib(int n, Map<Integer, Integer> memoize) {
//        if (memoize.containsKey(n)) {
//            return memoize.get(n);
//        } else {
//            memoize.put(n, getNthFib(n - 1, memoize) + getNthFib(n - 2, memoize));
//            return memoize.get(n);
//        }
//    }

    private static int getNthFib(int n) {
        int[] fib = new int[]{0, 1};
        int current = 3;//next number that we have to calculate, first two are already in the arr
        while (current <= n) {
            int nextFib = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = nextFib;
            current++;
        }
        return n > 1 ? fib[1] : fib[0];
    }
}
