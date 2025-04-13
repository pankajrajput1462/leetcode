package pan.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void validPalindrome() {
        boolean isValid = ValidPalindrome.validPalindrome("malayalam");
        assertTrue(isValid);

        assertTrue(ValidPalindrome.validPalindrome("Was it a car or a cat I saw"
                .replace(" ", "").toLowerCase()));
    }
}