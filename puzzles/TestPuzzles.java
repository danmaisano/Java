import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzles {

    public static void main(String[] args) {
        int numberOfRolls = 10; // allow the user to pick how many numbers to generate.
        Puzzles puzzle = new Puzzles();
        ArrayList<Integer> randomNumberGame = puzzle.randomNumberArray(numberOfRolls);
        System.out.println(randomNumberGame);


        // ArrayList<Character> alphabet = puzzle.pickALetter();
        // System.out.println(alphabet); // make sure the alphabet works
        char yourLetter = puzzle.pickALetter();
        System.out.println(yourLetter);

        int passwordLength = 18; // allow the user to pick how long of a password to generate.
        String yourPassword = puzzle.createPassword(passwordLength);
        System.out.println(yourPassword);

        int arrayLength = 12;
        int timesToShuffle = 25;
        ArrayList<String> shuffled = puzzle.createShuffledArray(arrayLength, timesToShuffle);
        System.out.println("Shuffled Array: " + shuffled);
    }
}
