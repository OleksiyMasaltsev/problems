/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows
 * in both arrays and you may return the result in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * <p>
 * Follow up:
 * <p>
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

package ua.masaltsev.leetcode.arrays;

import java.util.*;

public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int counter = map.getOrDefault(i, 0);
            map.put(i, counter + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }

//    public int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//
//        int i = 0, j = 0;
//        List<Integer> list = new ArrayList<>();
//
//        while (i < nums1.length && j < nums2.length) {
//            int a = nums1[i], b = nums2[j];
//            if (a == b) {
//                list.add(a);
//                i++;
//                j++;
//            } else if (a < b) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//
//        int[] ret = new int[list.size()];
//        for (int k = 0; k < list.size(); k++) ret[k] = list.get(k);
//
//        return ret;
//    }
}
