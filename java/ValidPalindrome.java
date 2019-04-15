package LeetCode;

public class ValidPalindrome {

    private boolean inScope(char c) {
        int value = Integer.valueOf(c);
        return  (value >=48 && value <= 57) || (value >= 97 && value <= 122);
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        int x = 0;
        int y = s.length() - 1;

        while ( x <= y) {
            if (!inScope(chars[x])) {
                x++;
                continue;
            }else if (!inScope(chars[y])) {
                y--;
                continue;
            }
            if (chars[x] != chars[y]) {
                return false;
            }
            x++;
            y--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String test = "0P";
        System.out.println(validPalindrome.isPalindrome(test));
    }
}
