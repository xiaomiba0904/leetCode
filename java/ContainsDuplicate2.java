package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsBearbyDuplicate(int[] nums, int k) {
        int lens = nums.length;
        if ( lens<= 1) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < lens; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
