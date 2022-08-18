/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 * <p>
 * Examples:
 * <p>
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */

package ua.masaltsev.codewars;

public class SpinWords {

    public String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder resultBuilder = new StringBuilder();

        for (String word : words) {
            if (word.length() >= 5) {
                resultBuilder.append(new StringBuilder(word).reverse());
            } else {
                resultBuilder.append(word);
            }
            resultBuilder.append(" ");
        }

        return resultBuilder.toString().trim();

    }

}
