import org.junit.jupiter.api.Test;

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
}
