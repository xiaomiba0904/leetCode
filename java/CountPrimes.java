package LeetCode;


import java.util.Arrays;


public class CountPrimes {

    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        int val = 0;
        int[] list = new int[n];
        Arrays.fill(list, 1);
        list[0] = 0;
        list[1] = 0;

        for (int i = 2; i < (Math.pow(n, 0.5) + 1); i++) {
            if (list[i] == 1) {
                for (int j = i*i; j < n; j+=i) {
                    list[j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (list[i] == 1) {
                val++;
            }
        }

        return val;
    }

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(100));
    }
}
