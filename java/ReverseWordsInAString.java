package LeetCode;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] list = s.split(" ");
        for (String i: list) {
            result.append(reverserAWord(i));
            result.append(" ");
        }
        result.delete(result.length() - 1, result.length());
        return result.toString();
    }

    private StringBuilder reverserAWord(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i-- ) {
            result.append(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        String test = "Let's take LeetCode contest";
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();

        System.out.println(reverseWordsInAString.reverseWords(test));
    }
}
