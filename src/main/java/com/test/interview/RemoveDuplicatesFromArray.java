package com.test.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem statement:
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 2, 3, 4, 5, 5, 5};
        int k = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> newArray = new ArrayList<>();
        if(nums.length == 0) {
            return 0;
        }
        newArray.add(Integer.valueOf(nums[0]));
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                newArray.add(Integer.valueOf(nums[i + 1]));
            }
        }
        for (int i = 0; i < newArray.size(); i++) {
            nums[i] = newArray.get(i);
        }
        return newArray.size();
    }
}
