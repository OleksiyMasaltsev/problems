/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 1
 */

package ua.masaltsev.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayFive {
    public int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        int a;
        int b;

        for (int i = 1; i < nums.length; i += 2) {
            a = nums[i - 1];
            b = nums[i];

            if (a != b) {
                return a;
            }
        }

        return nums[nums.length - 1];

        /*Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            if (integerSet.contains(num)) {
                integerSet.remove(num);
            } else {
                integerSet.add(num);
            }
        }
        return (int)integerSet.toArray()[0];*/

        /*int x = 0;
        for (int num : nums) {
            x = x ^ num;
        }
        return x;*/
    }
}
