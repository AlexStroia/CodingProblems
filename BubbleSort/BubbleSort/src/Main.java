public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 50, 23, 23, 43, 1, 2, 2, 43, 5, 1};

        bubbleSort(array);
        printArray(array);
    }


    private static void bubbleSort(int[] array) {
        int counter = 0;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            counter++;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int current = array[i];
        array[i] = array[j];
        array[j] = current;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
