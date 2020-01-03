public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = new int[] {12312,3213,2,1,2,32,2};
        insertionSort(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int unsortedIndex = i;
            while (unsortedIndex > 0 && array[unsortedIndex] < array[unsortedIndex - 1]) {
                swap(array, unsortedIndex, unsortedIndex-1);
                unsortedIndex--;
            }
        }
        return array;
    }

    public static void swap(int[] array, int unsortedIndex, int j) {
        int current = array[unsortedIndex];
        array[unsortedIndex] = array[j];
        array[j] = current;
    }
}
