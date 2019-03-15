package LeetCode;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.equals("")) {
            return s;
        }

        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; i - j > end - start ; j++) {
                int m = j, n = i;
                while (m < n) {
                    if (chars[m] == chars[n]) {
                        m++;
                        n--;
                    }else {
                        break;
                    }
                }
                if (m >= n) {
                    start = j;
                    end = i;
                }
            }
        }

        return s.substring(start, end+1);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring =
                new LongestPalindromicSubstring();

        String s = "abcbae";
        System.out.println(longestPalindromicSubstring.longestPalindrome(s));
    }
}
