package LeetCode;

public class UniquePaths {

    public int run(int m, int n ) {
        int[][] all = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0) {
                    all[i][j] = 1;
                }else {
                    all[i][j] = all[i-1][j] + all[i][j-1];
                }
            }
        }
        return  all[m-1][n-1];
    }

    public int run2(int m, int n) {
        if(m <= 0 || n <= 0) {
            return 0;
        }else if (m == 1 || n == 1 ) {
            return 1;
        }

        int len = m+n-2;
        int mix = Math.min(m, n);

        double a = 1.0;
        double b = 1.0;
        for (int i = 1; i < mix ; i++) {
            a *= i;
            b *= len--;
        }
        return Double.valueOf(b/a).intValue();
    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.run2(3,2));
    }
}
