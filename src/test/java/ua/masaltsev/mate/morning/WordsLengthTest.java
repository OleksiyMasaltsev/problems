package ua.masaltsev.mate.morning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsLengthTest {
    @Test
    void getWordsLength() {

        String[] words1 = {"java", "mad", "zoo"};
        String[] words2 = {"jazz", "hazy", "lazy"};
        String[] words3 = {"pizza", "apple", "legalize"};

        assertEquals(7, WordsLength.getWordsLength(words1));
        assertEquals(0, WordsLength.getWordsLength(words2));
        assertEquals(5, WordsLength.getWordsLength(words3));
    }
}