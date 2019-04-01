package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWordDemo {

    public int lengthOfLastWord(String s) {
        String[] list = s.split(" ");
        for (int i = list.length - 1; i >= 0; i--) {
            String r = list[i];
            if (r.length() > 0) {
                return r.length();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String test = "a";
        LengthOfLastWordDemo demo = new LengthOfLastWordDemo();
        System.out.println(demo.lengthOfLastWord(test));
    }
}
