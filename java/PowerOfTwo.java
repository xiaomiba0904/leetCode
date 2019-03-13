package LeetCode;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n <= 0 ? false : (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(20));

    }
}
