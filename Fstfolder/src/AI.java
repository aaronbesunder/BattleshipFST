import java.util.ArrayList;
public class AI {
    public int computerGuess;
    public ArrayList <Integer> guesses = new ArrayList<>();
    public AI () {

    }
    public int getComputerGuess() {
        boolean badData = true;
        int w = UserInterface.getWin();
        if (w==1) {
            do {
                try {
                    int rando = (int) ((Math.random() * 4) + 1);
                    if (rando == 1) {
                        computerGuess = UserInterface.hits.get(UserInterface.hits.size()-1) + 10;
                    } else if (rando == 2) {
                        computerGuess = UserInterface.hits.get(UserInterface.hits.size()-1) - 10;
                    } else if (rando == 3) {
                        computerGuess = UserInterface.hits.get(UserInterface.hits.size()-1) + 1;
                    } else if (rando == 4) {
                        computerGuess = UserInterface.hits.get(UserInterface.hits.size()-1) - 1;
                    }
                    if (guesses.contains(computerGuess)) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                }catch (Exception e) {
                    badData = true;
                }
            }while (badData);
        }
        else if (w == 2) {
            do {
                try {
                    if (UserInterface.hits.get(UserInterface.hits.size() - 1) + 10 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        int rando1 = (int) (Math.random() * 2);
                        if (rando1 == 0) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) + 20;
                        } else if (rando1 == 2) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) - 10;
                        }
                    } else if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 10 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        int rando1 = (int) (Math.random() * 2);
                        if (rando1 == 0) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) + 10;
                        } else if (rando1 == 2) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) - 20;
                        }
                    } else if (UserInterface.hits.get(UserInterface.hits.size() - 1) + 1 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        int rando1 = (int) (Math.random() * 2);
                        if (rando1 == 0) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) + 2;
                        } else if (rando1 == 2) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) - 1;
                        }
                    } else if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 1 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        int rando1 = (int) (Math.random() * 2);
                        if (rando1 == 0) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) + 1;
                        } else if (rando1 == 2) {
                            computerGuess = UserInterface.hits.get(UserInterface.hits.size() - 1) - 2;
                        }
                    }
                    if (guesses.contains(computerGuess)) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                } catch (Exception e) {
                    badData = true;
                }
            } while (badData);
        }
        else if (w == 3) {

        }
        else if (w == 0) {
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
