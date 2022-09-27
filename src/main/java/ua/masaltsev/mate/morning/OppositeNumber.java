/**
 * Implement a method oppositeNumber() that accepts an integer number and returns its opposite.
 * <p>
 * Examples:
 * <p>
 * - for the number 1, the opposite is -1;
 * - for the number -100, the opposite is 100.
 */

package ua.masaltsev.mate.morning;

public class OppositeNumber {
    public static int oppositeNumber(int number) {
        if (number == 0) {
            return 0;
        }
        return number > 0 ? -number : number * -1;
    }
}
