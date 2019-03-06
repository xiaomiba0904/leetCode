package LeetCode;

import java.util.Arrays;

public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] test = {3,2,1,2,4,5,5,6};
        KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
        System.out.println(kthLargestElementInAnArray.findKthLargest(test, 4));
    }
}
