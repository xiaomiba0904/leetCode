package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        Arrays.sort(nums);
        int value = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (value == nums[i]) {
                return true;
            }else {
                value = nums[i];
            }
        }
        return false;
    }
}
