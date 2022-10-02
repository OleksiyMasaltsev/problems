/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * <p>
 * Visualization:
 * nums =   "----->-->"; k =3
 * result = "-->----->";
 * <p>
 * reverse "----->-->" we can get   "<--<-----"
 * reverse "<--" we can get         "--><-----"
 * reverse "<-----" we can get      "-->----->"
 * this visualization help me figure it out :)
 */

package ua.masaltsev.leetcode.arrays;

public class ArrayThree {
    public void rotate(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

    /*
    // brute force implementation
    public void rotate(int[] nums, int k) {

        int length = nums.length;
        int targetIndex;
        int[] resultArray = new int[length];
        k = k % length;

        for (int i = 0; i < length; i++) {
            targetIndex = i + k;
            if (targetIndex > length - 1) {
                targetIndex = targetIndex - length;
            }
            resultArray[targetIndex] = nums[i];
        }

        System.arraycopy(resultArray, 0, nums, 0, nums.length);
    }*/

