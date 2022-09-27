/**
 * mplement a method toBinary() that accepts a non-negative integer num and returns it in a binary format.
 * <p>
 * Examples:
 * <p>
 * num = 1 // returns 1;
 * num = 5 // returns 101;
 * num = 11 // returns 1011.
 */

package ua.masaltsev.mate.morning;

public class ConvertToBinary {
    public static int toBinary(int num) {
        String binaryString = Integer.toBinaryString(num);
        return Integer.parseInt(binaryString);
    }
}
