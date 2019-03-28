package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {


    /**
     * 说明： j 表示子串终止位置，i表示字串起始位置 当未出现重复时，
     * 字符串的长度即为字符串的结束位置减去起始位置。发生重复时，
     * 重新利用字符串的结束位置j减去新的起始位置i，
     * 并与之前的未重复字串的长度作比较取较大者
     */
    public int lengthOfLongestSubstring(String s) {
        Map<String, Integer> map= new HashMap<>();
        Integer i = 0;
        Integer ans = 0;

        for (int j = 0; j < s.length(); j++) {
            String r = String.valueOf(s.charAt(j));
            if (map.containsKey(r)) {
                i = Math.max(map.get(r), i);
            }
            ans = Math.max(ans, j - i +  1);
            map.put(r, j+1);
        }

        return ans;
    }


    public int lengthOfLongestSubstringFast(String s) {
        int length = s.length();
        int ans = 0;
        // 字符转化成数字最大为128
        int[] array = new int[128];

        for (int i = 0, j=0; i <length ; i++) {
            j = Math.max(array[s.charAt(i)], j);
            ans = Math.max(ans, i-j +1);
            array[s.charAt(i)] = i+1;
        }
        return ans;

    }
    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingCharacters l = new LongestSubStringWithoutRepeatingCharacters();
        String test = "abcabcbb";
        System.out.println(l.lengthOfLongestSubstring(test));
    }
}
