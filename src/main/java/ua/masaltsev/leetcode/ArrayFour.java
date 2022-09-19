/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */

package ua.masaltsev.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ArrayFour {
    // using HashSet
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> distinctSet = new HashSet<>();

        for (int i : nums) {
            if (distinctSet.contains(i)) {
                return true;
            } else {
                distinctSet.add(i);
            }
        }
        return false;
    }

    // brute force
    /*public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }*/
}
