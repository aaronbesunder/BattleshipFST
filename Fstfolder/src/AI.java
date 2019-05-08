import java.util.ArrayList;
public class AI {
    public int computerGuess;
    public ArrayList <Integer> guesses = new ArrayList<>();
    public AI () {

    }
    public int getComputerGuess() {
        boolean badData = true;
        do {
            try {
                computerGuess = (int) ((Math.random()*100)+1);
                if (guesses.contains(computerGuess)) {
                    throw new IllegalArgumentException();
                }
                badData = false;
            }catch (Exception e) {
                badData = true;
            }
        }while(badData);
        guesses.add(computerGuess);
        return computerGuess;
    }
}
