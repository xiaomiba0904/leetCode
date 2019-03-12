package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int len = nums.length;
        int mul = 1;
        for (int i = 0; i < len; i++) {
            result[i] = mul;
            mul *= nums[i];
        }

        mul = 1;
        for (int i = len-1; i >=0 ; i--) {
            result[i] *= mul;
            mul *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] test = {1,2,3,4};
        int[] result = productOfArrayExceptSelf.productExceptSelf(test);
        System.out.print("[");
        for (int i:
             result) {
            System.out.print(i + ",");
        }
        System.out.println("]");
    }
}
