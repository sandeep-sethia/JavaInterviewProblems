package com.test.interview;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 126;
        boolean response = false;
        while(response) {
            if(!response) {

            }
            response = isPalindrome(number);
        }

    }

    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        int strLength = numberString.length();
        for(int i =0; i< strLength/2 ; i++) {
            if(numberString.charAt(i) != numberString.charAt(strLength-1)) {
                return false;
            }
        }
        return true;
    }
}
