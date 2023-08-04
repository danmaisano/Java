import java.util.ArrayList;
import java.util.Random;


public class Puzzles {

    public int pickRandomNumber(int maxNumber) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(maxNumber) + 1; // .nextInt(1000) generates int from 0 to 999 (inclusively)
    }

    public ArrayList<Integer> randomNumberArray(int numberOfRolls){
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numberOfRolls; i++){
            randomNumbers.add(pickRandomNumber(20));
        }
        return randomNumbers;
    }

    public ArrayList<Character> createAlphabetArray() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        return alphabet;
    }

    public char pickALetter() {
        ArrayList<Character> alphabetArray = createAlphabetArray();
        int newIndex = pickRandomNumber(25);
        return alphabetArray.get(newIndex);
    }

    public String pickASymbol() {
        String[] symbolArray = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
        int newSymbol = pickRandomNumber(9);
        return symbolArray[newSymbol];
    }

    public String createPassword(int passwordLength) {
        String password = "";
        for (int i = 0; i < passwordLength; i++) {
            int pickType = pickRandomNumber(3);
            if (pickType == 1){
                password += pickALetter();
            }
            else if (pickType == 2){
                password += pickASymbol();
            }
            else {
                Random randomGenerator = new Random();
                int newNumber = randomGenerator.nextInt(10);
                password += newNumber;
            }
        }
        return password;
    }

    public ArrayList<String> createShuffledArray(int lengthOfArray, int timesToShuffle) {
        Random randomGenerator = new Random();
        ArrayList<String> shuffled = new ArrayList<String>();
        for(int i = 0; i < lengthOfArray; i++) {
            shuffled.add(String.valueOf(pickALetter()));
        }
        System.out.println("Original Array: " + shuffled);
        for (int j = 0; j < timesToShuffle; j++){
            int indexToSwapA = randomGenerator.nextInt(lengthOfArray-1);
            int indexToSwapB = randomGenerator.nextInt(lengthOfArray-1);
            String holder = shuffled.get(indexToSwapA);
            shuffled.set(indexToSwapA, shuffled.get(indexToSwapB));
            shuffled.set(indexToSwapB, holder);
        }
        return shuffled;
    }

}