package com.test.interview;

/**
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 *
 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them,
 * causing the left and the right side of the deleted substring to concatenate together.
 *
 *
 *
 *  Input: s = "abcd", k = 2
 *  Output: "abcd"
 *  Explanation: There's nothing to delete.
 *
 *  Input: s = "deeedbbcccbdaa", k = 3
 *  Output: "aa"
 *  Explanation:
 *  First delete "eee" and "ccc", get "ddbbbdaa"
 *  Then delete "bbb", get "dddaa"
 *  Finally delete "ddd", get "aa"
 *
 *  We repeatedly make k duplicate removals on s until we no longer can.
 *
 *  Return the final string after all such duplicate removals have been made.
 *  It is guaranteed that the answer is unique.
 *
 *  Input: s = "pbbcggttciiippooaais", k = 2
 *  Output: "ps"
 */

public class DuplicateRemoverWithFactor {
    public static void main(String[] args) {
        String input = "deeedbbcccbdaab";
        //deeedbbcccbdaa
        //ddbbcccbdaa
        //ddbbbdaa
        int factor = 3;
        System.out.println("final result = " +deleteK(input, factor));
    }

    public static String deleteK(String input, int k) {
        if(input.length() < k) {
            return input;
        }
        System.out.println("input string = " +input);
        int sameCounter = 1;
        for(int i=1; i<input.length(); i++) {
            if(input.charAt(i) == input.charAt(i-1)) {
                sameCounter++;
                if(sameCounter == k) {
                    String string1 = input.substring(0, i-2);
                    String string2 = input.substring(i+1);
                    deleteK(string1.concat(string2), k);
                }
            } else {
                sameCounter =1;
            }
        }
        return input;
    }
}
