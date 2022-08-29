/**
 * I will give you an integer. Give me back a shape that is as long and wide as the integer.
 * The integer will be a whole number between 1 and 50.
 * <p>
 * Example
 * n = 3, so I expect a 3x3 square back just like below as a string:
 * <p>
 * +++
 * +++
 * +++
 */

package ua.masaltsev.codewars;

public class BuildSquare {
    public static String generateShape(int n) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            stringBuilder.append("\n");
            for (int j = 0; j < n; j++) {
                stringBuilder.append("+");
            }
        }

        return stringBuilder.deleteCharAt(0).toString();
    }
}
