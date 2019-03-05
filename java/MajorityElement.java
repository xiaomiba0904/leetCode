package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        Integer max_value = 0;
        Integer max_key = nums[0];

        for (int i = 0; i < nums.length ; i++) {
            Integer number = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], number);

            if (number > max_value) {
                max_value = number;
                max_key = nums[i];
            }
        }

        return max_key;
    }

    // 摩尔投票法
    public int majorityElement2(int[] nums) {
        int count = 1;
        int value = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (value == nums[i]) {
                count++;
            }else {
                count--;
                if (count == 0) {
                    value = nums[i+1];
                }
            }
        }
        return value;
    }

    public int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int[] test = {5,5,4,2};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement2(test));
    }
}
