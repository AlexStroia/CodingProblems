package com.alex;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{12312, 3213, 2, 1, 2, 32, 2};
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] selectionSort(int[] array) {
        int startIndex = 0;
        while (startIndex < array.length - 1){
            int smalestIndex = startIndex;

            for(int j=startIndex + 1;j<array.length;j++) {
                if(array[j] < array[smalestIndex]) {
                    smalestIndex = j;
                }
            }
            swap(array,startIndex,smalestIndex);
            startIndex++;
        }
        return array;
    }

    public static void swap(int[] array, int unsortedIndex, int j) {
        int current = array[unsortedIndex];
        array[unsortedIndex] = array[j];
        array[j] = current;
    }
}

