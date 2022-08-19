/**
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 * <p>
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

package ua.masaltsev.codewars;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    public static int findIt(int[] a) {

        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i : a) {
            if (numberMap.containsKey(i)) {
                numberMap.put(i, numberMap.get(i) + 1);
            } else {
                numberMap.put(i, 1);
            }
        }

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result = entry.getKey();
            }
        }

        return result;
    }

//    public static int findIt(int[] A) {
//
//        int result = 0;
//        for (int j : A) {
//            result = result ^ j;
//        }
//        return result;
//    }
}





















