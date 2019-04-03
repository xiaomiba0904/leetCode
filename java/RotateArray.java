package LeetCode;

public class RotateArray {
    public void rotate_1(int[] nums, int k) {
        int n = nums.length;
        int tmp;
        for (int i = 0; i < k; i++) {
            tmp = nums[n - 1];
            for (int j = n - 1; j > 0 ; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }

    public void rotate_2(int[] nums, int k) {
        k %= nums.length;

        int[] tmp = nums.clone();
        System.arraycopy(tmp, tmp.length - k, nums, 0 , k);
        System.arraycopy(tmp, 0, nums, k, tmp.length - k);
    }

    /**
     * 循环交换
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void rotate_3(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        // 第一次交换完毕后，前 k 位数字位置正确，后 n-k 位数字中最后 k 位数字顺序错误，继续交换
        for (int start = 0; start < nums.length && k != 0; n -= k, start += k, k %= n) {
            for (int i = 0; i < k; i++) {
                swap(nums, start + i, nums.length - k + i);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
