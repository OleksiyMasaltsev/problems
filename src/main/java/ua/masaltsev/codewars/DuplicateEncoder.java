/**
 * The goal of this exercise is to convert a string to a new string
 * where each character in the new string is "(" if that character appears only once in the original string,
 * or ")" if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 * <p>
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 * <p>
 * Notes
 * Assertion messages may be unclear about what they display in some languages.
 * If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 */

package ua.masaltsev.codewars;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word) {
        Map<Character, Integer> lettersMap = new HashMap<>();
        char[] chars = word.toLowerCase().toCharArray();
        for (Character symbol : chars) {
            lettersMap.put(symbol, lettersMap.getOrDefault(symbol, 0) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : chars) {
            if (lettersMap.getOrDefault(c, 0) == 1) {
                stringBuilder.append("(");
            } else {
                stringBuilder.append(")");
            }
        }
        return stringBuilder.toString();
    }
}
