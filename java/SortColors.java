package LeetCode;

public class SortColors {
    private int red = 0;

    private int white = 0;

    public void sortColors(int[] nums) {
        for (int num : nums) {
            switch (num) {
                case 0:
                    red++;
                    break;
                case 1:
                    white++;
                    break;
            }
        }

        for(int i = 0; i< nums.length; i++) {
            if (i <= red - 1) {
                nums[i] = 0;
            }else if (i > red -1 && i <= white + red -1) {
                nums[i] = 1;
            }else {
                nums[i] = 2;
            }
        }
    }
}
