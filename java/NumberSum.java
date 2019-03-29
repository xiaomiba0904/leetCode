package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NumberSum {

    public Integer arraySum(List<Integer> list) {
        Integer sum = 0;
        for (Integer i:list) {
            sum += i;
        }
        return sum;
    }
    public Integer arraySum(int[] list) {
        Integer sum = 0;
        for (Integer i:list) {
            sum += i;
        }
        return sum;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        //Arrays.sort() 可以用于对基本类型的数组排序
        //Collections.sort() 用于对List进行排序
        //Arrays.asList() 可以将包裹类型的array转换为list, 但不可将基本类型的array转换为list
        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++){
            //去重
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j=i+1; j<nums.length-2; j++){
                //去重
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                //对撞指针
                int l=j+1, r=nums.length-1;
                int temp = target-nums[i]-nums[j];

                while(l<r){
                    if(nums[l]+nums[r] == temp){
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while(l<r && nums[l] == nums[l+1]){
                            l++;
                        }
                        while(l<r && nums[r] == nums[r-1]){
                            r--;
                        }
                        l++;
                        r--;
                    }else if(nums[l]+nums[r] > temp){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] test = {1, 0, -1, 0, -2, 2};
        NumberSum numberSum = new NumberSum();
        List<List<Integer>> results = numberSum.fourSum(test, 0);
        for (List<Integer> result : results) {
            System.out.print("[");
            for (Integer r : result) {
                System.out.print(r.toString() + ",");
            }
            System.out.println("]");
        }
    }
}
