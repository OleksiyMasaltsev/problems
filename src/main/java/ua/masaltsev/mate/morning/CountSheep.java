/**
 * Implement a method countSheep() that accepts a non-negative integer number of sheep and counts them to fall asleep faster.
 * <p>
 * Return a string with a murmur, for example:
 * <p>
 * if number = 1, then murmur is "1 sheep...";
 * if number = 2, then murmur is "1 sheep...2 sheep...";
 * if number = 3, then murmur is "1 sheep...2 sheep...3 sheep...".
 */

package ua.masaltsev.mate.morning;

public class CountSheep {
    public static String countSheep(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;
        while (counter <= number) {
            stringBuilder.append(counter).append(" sheep...");
            counter++;
        }
        return stringBuilder.toString();
    }
}