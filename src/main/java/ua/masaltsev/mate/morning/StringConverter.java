/**
 * Implement a method stringify() that takes a positive integer size and returns a string of alternating 1 and 0.
 * <p>
 * Conditions:
 * <p>
 * the returned string should start with 1
 * the length of the returned string should be equal to the size
 * Examples:
 * <p>
 * size = 1 // returns "1"
 * size = 3 // returns "101"
 * size = 6 // returns "101010"
 */

package ua.masaltsev.mate.morning;

public class StringConverter {
    public static String stringify(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isZero = false;
        while (size > 0) {
            if (isZero) {
                stringBuilder.append("0");
                isZero = false;
            } else {
                stringBuilder.append("1");
                isZero = true;
            }
            size--;
        }
        return stringBuilder.toString();
    }
}