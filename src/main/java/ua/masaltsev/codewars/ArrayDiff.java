/**
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 * <p>
 * It should remove all values from list a, which are present in list b keeping their order.
 * <p>
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * If a value is present in b, all of its occurrences must be removed from the other:
 * <p>
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

package ua.masaltsev.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {

        IntStream intStreamA = Arrays.stream(a);

        for (int j : b) {
            intStreamA = intStreamA.filter(i -> i != j);
        }

        return intStreamA.toArray();
    }
}
