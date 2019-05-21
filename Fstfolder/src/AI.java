import java.util.ArrayList;
import java.util.Collections;
public class AI {
    public int computerGuess;
    public boolean vertical = true;
    public ArrayList <Integer> guesses = new ArrayList<>();
    public AI () {

    }
    public int getComputerGuess() {
        boolean badData = true;
        double w = UserInterface.getWin();
        if (w == 1.0) { //win is 1
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
                    if (guesses.contains(computerGuess) || computerGuess>100 || computerGuess<1) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                }catch (Exception e) {
                    badData = true;
                }
            }while (badData);
        }
        else if (w == 2.0) { //win is 2
            do {
                try {
                    Collections.sort(UserInterface.hits);
                    if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 10 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        vertical = true;
                    }
                    else if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 1 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        vertical = false;
                    }
                    int min = UserInterface.hits.get(0);
                    if (vertical) {
                        int rando1 = (int) (Math.random() * 2);
                        if (rando1 == 0) {
                            computerGuess = min + 20;
                        } else if (rando1 == 1) {
                            computerGuess = min - 10;
                        }
                    }
                    else if (!vertical) {
                        if (!guesses.contains(min+2) && ((min-1)%10 ==0)) {
                            computerGuess = min+2;
                        }
                        else if (!guesses.contains(min-1) && ((min+1)%10 ==0)) {
                            computerGuess = min-1;
                        }
                        else {
                            int rando1 = (int) (Math.random() * 2);
                            if (rando1 == 0) {
                                computerGuess = min + 2;
                            } else if (rando1 == 1) {
                                computerGuess = min - 1;
                            }
                        }
                    }
                    if (guesses.contains(computerGuess) || computerGuess>100 || computerGuess<1) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                } catch (Exception e) {
                    badData = true;
                }
            } while (badData);
        }
        else if (w == 3.0) { //win is 3
            do {
                try {
                    Collections.sort(UserInterface.hits);
                    if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 10 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        vertical = true;
                    }
                    else if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 1 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        vertical = false;
                    }
                    int min = UserInterface.hits.get(0);
                    if (vertical) {
                        if ((guesses.contains(min+30) && guesses.contains(min-10))) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min+30) && (min-10)<1) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min-10) && (min+40)>100) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else {
                            int rando2 = (int) (Math.random() * 2);
                            if (rando2 == 0) {
                                computerGuess = min + 30;
                            } else if (rando2 == 1) {
                                computerGuess = min - 10;
                            }
                        }
                    } else if (!vertical) {
                        if ((guesses.contains(min+3) && guesses.contains(min-1))) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min+3) && ((min-1)%10 == 0)) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min-1) && ((min+2)%10 == 0)) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (!guesses.contains(min+3) && ((min-1)%10 ==0)) {
                            computerGuess = min+3;
                        }
                        else if (!guesses.contains(min-1) && ((min+2)%10 ==0)) {
                            computerGuess = min-1;
                        }
                        else {
                            int rando2 = (int) (Math.random() * 2);
                            if (rando2 == 0) {
                                computerGuess = min + 3;
                            } else if (rando2 == 1) {
                                computerGuess = min - 1;
                            }
                        }
                    }
                    if (guesses.contains(computerGuess) || computerGuess>100 || computerGuess<1) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                }catch (Exception e) {
                    badData = true;
                }
            }while(badData);
        }
        else if (w == 4.0) { //win is 4
            do {
                try {
                    Collections.sort(UserInterface.hits);
                    if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 10 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        vertical = true;
                    }
                    else if (UserInterface.hits.get(UserInterface.hits.size() - 1) - 1 == UserInterface.hits.get(UserInterface.hits.size() - 2)) {
                        vertical = false;
                    }
                    int min = UserInterface.hits.get(0);
                    if (vertical) {
                        if ((guesses.contains(min+40) && guesses.contains(min-10))) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min-10) && (min+40)>100) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min+40) && (min-10)<1) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else {
                            int rando2 = (int) (Math.random() * 2);
                            if (rando2 == 0) {
                                computerGuess = min + 40;
                            } else if (rando2 == 1) {
                                computerGuess = min - 10;
                            }
                        }
                    } else if (!vertical) {
                        if ((guesses.contains(min + 4) && guesses.contains(min - 1))) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min + 4) && ((min-1)%10 == 0)) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (guesses.contains(min-1) && ((min+3)%10 == 0)) {
                            computerGuess = (int)((Math.random()*100)+1);
                            UserInterface.win = 0;
                            UserInterface.hits.clear();
                        }
                        else if (!guesses.contains(min+4) && ((min-1)%10 == 0)) {
                            computerGuess = min+4;
                        }
                        else if (!guesses.contains(min-1) && ((min+3)%10 == 0)) {
                            computerGuess = min-1;
                        }
                        else {
                            int rando2 = (int) (Math.random() * 2);
                            if (rando2 == 0) {
                                computerGuess = min + 4;
                            } else if (rando2 == 1) {
                                computerGuess = min - 1;
                            }
                        }
                    }
                    if (guesses.contains(computerGuess) || computerGuess>100 || computerGuess<1) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                }catch (Exception e) {
                    badData = true;
                }
            }while(badData);
        }
        else if (w == 0 | w ==5) { //win is 0 or 5
            if (w == 5) {
                UserInterface.win = 0;
                UserInterface.hits.clear();
            }
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
