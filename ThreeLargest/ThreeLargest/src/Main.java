public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 23, 213, 4, 54, 3, 2, 2, 2};
        for(int num : findThreeLargestNumbers(arr)) {
            System.out.println(num);
        }
    }

    private static int[] findThreeLargestNumbers(int[] array) {
        int[] nums = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};


        for (int num : array) {
            if (num > nums[2]) {
                shiftAndUpdate(nums, 2, num);
            } else if (num > nums[1]) {
                shiftAndUpdate(nums, 1, num);
            } else if (num > nums[0]) {
                shiftAndUpdate(nums, 0, num);
            }
        }
        return nums;
    }


    //[3, 2, 4, 5]

    private static void shiftAndUpdate(int[] nums, int index, int num) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                nums[i] = num;
            } else {
                nums[i] = nums[i + 1];
            }
        }
    }
}
