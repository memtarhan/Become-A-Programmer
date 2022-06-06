import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hangman {

    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o'};
    Set<String> usedWordsSet = new HashSet<>();

    public int countLetter(String word, char letter) {
        int count = 0;
        for (char character : word.toCharArray()) {
            if (character == letter) count++;
        }

        return count;
    }

    public String fetchWord() {
        return "pizza";
    }

    public String fetchWord(int requestedLength) {
        Random random = new Random();
        int index = random.nextInt(alphabet.length);
        String word = String.valueOf(alphabet[index]).repeat(Math.max(0, requestedLength));

        if (usedWordsSet.contains(word)) return fetchWord(requestedLength);
        else {
            usedWordsSet.add(word);
            return word;
        }
    }
}
