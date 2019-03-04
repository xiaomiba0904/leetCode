package LeetCode;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }
        int result = 1;

        for (int i = result; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test = {1,2};
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        System.out.println(r.removeDuplicates(test));
        System.out.print("[");
        for (int i = 0; i < test.length; i++) {
            System.out.print(String.format("%d,", test[i]));
        }
        System.out.println("]");
    }
}
