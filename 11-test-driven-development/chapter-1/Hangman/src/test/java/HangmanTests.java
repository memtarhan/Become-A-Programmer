import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTests {

    @Test
    void testLetterCount() {
        Hangman hangman = new Hangman();

        String word = "Mehmet";
        char letter = 'm';
        int count = hangman.countLetter(word, letter);

        assertEquals(count, 1);
        assertTrue(count > 0);
        assertFalse(count > word.length());
    }

    @Test
    void testLengthOfFetchedWord() {
        Hangman hangman = new Hangman();
        String word = hangman.fetchWord();

        assertEquals(5, word.length());
    }

    @Test
    void  testLengthOfFetchedWordRandom() {
        Random random = new Random();
        int requestedLength = random.nextInt(6) + 5;
        Hangman hangman = new Hangman();
        String word = hangman.fetchWord(requestedLength);

        assertEquals(requestedLength, word.length());
    }

    @Test
    void testUniquenessOfFetchedWord() {
        Random random = new Random();
        int requestedLength = 0;
        Set<String> usedWordsSet = new HashSet<>();
        int round = 0;
        String word = null;
        Hangman hangman = new Hangman();

        while (round < 2) {
            requestedLength = random.nextInt(6) + 5;
            word = hangman.fetchWord(requestedLength);
            round++;
            assertTrue(usedWordsSet.add(word));
        }
    }
}
