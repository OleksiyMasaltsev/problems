/**
 * Implement a getWordsLength() method, that takes an array of strings words and returns the total length of words,
 * that contain the small letter "a" but do not contain the small letter "z".
 * If the words array is empty - the method returns 0.
 * <p>
 * Return the number with total count, for example:
 * <p>
 * if words = ["java", "mad", "zoo"], the result will be 7;
 * if words = ["jazz", "hazy", "lazy"], the result will be 0;
 * if words = ["pizza", "apple", "legalize"], the result will be 5.
 */

package ua.masaltsev.mate.morning;

public class WordsLength {
    public static int getWordsLength(String[] words) {

        if (words.length == 0) {
            return 0;
        }

        int totalCount = 0;
        for (String word : words) {
            if (word.contains("a") && !word.contains("z")) {
                totalCount += word.length();
            }
        }

        return totalCount;
    }
}