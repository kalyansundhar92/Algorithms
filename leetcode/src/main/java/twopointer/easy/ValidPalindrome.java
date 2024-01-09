package main.java.twopointer.easy;

import java.util.stream.IntStream;

public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
    }

    public boolean isPalindrome(String s) {
        String text = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        return IntStream.range(0, text.length()/2)
                .allMatch(index -> text.charAt(index) == text.charAt(text.length() - index - 1));
    }
}


