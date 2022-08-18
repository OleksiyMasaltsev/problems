/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * <p>
 * Note: The function accepts an integer and returns an integer
 */

package ua.masaltsev.codewars;

public class SquareDigit {
    public int squareDigits(int n) {
        String input = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : input.split("")) {
            int i = Integer.parseInt(s);
            stringBuilder.append(i * i);
        }

        return Integer.parseInt(stringBuilder.toString());
    }
}
