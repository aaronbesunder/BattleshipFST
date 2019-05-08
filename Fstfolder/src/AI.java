import java.util.ArrayList;
public class AI {
    public int computerGuess;
    public ArrayList <Integer> guesses = new ArrayList<>();
    public AI () {

    }
    public int getComputerGuess() {
        boolean badData = true;
        int w = UserInterface.getWin();
        int g = UserInterface.getCount1();
        if (w==1) {
            int rando = (int)((Math.random()*4)+1);
            if (rando == 1) {
                computerGuess = guesses.get((g / 2)-2)+10;
            }
            else if (rando == 2) {
                computerGuess = guesses.get((g / 2)-2)-10;
            }
            else if (rando == 3) {
                computerGuess = guesses.get((g / 2)-2)+1;
            }
            else if (rando == 4) {
                computerGuess = guesses.get((g / 2)-2)-1;
            }
        }
        else if (w==0) {
            do {
                try {
                    computerGuess = (int) ((Math.random() * 100) + 1);
                    if (guesses.contains(computerGuess)) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                } catch (Exception e) {
                    badData = true;
                }
            } while (badData);
        }
        guesses.add(computerGuess);
        return computerGuess;
    }
}
