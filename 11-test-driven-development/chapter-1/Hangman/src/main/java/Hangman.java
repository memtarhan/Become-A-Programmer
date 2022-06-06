public class Hangman {
    public int countLetter(String word, char letter) {
        int count = 0;
        for (char character : word.toCharArray()) {
            if (character == letter) count++;
        }

        return count;
    }
}
