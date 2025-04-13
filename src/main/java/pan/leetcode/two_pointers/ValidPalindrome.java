package pan.leetcode.two_pointers;

public class ValidPalindrome {

    public static boolean validPalindrome(String str) {

        char[] charArray = str.toCharArray();
        int first = 0, last = charArray.length - 1;

        while ((charArray[first] == charArray[last])) {
            first++;
            last--;
            if (first == last) {
                return true;
            }
        }

        return false;
    }
}
