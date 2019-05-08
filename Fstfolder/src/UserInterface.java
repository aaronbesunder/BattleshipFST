import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class UserInterface {
    public static AI computerGuess = new AI();
    public static void main(String[] args) {

        Boards userBoard = new Boards();
        System.out.println(userBoard.userBoard);

        System.out.println("Hello! Welcome to battleship.");
        System.out.println("On a 10 by 10 board, you will place five ships with different sizes either vertically or horizontally, without overlaps.");
        ArrayList<Integer> playerBoard = new ArrayList<>();
        System.out.println("The first ship is a 5, type 0 to place it vertically or 1 to place horizontally:");
        int verthoriz = 0;
        Scanner sc;

        boolean badData = true;
        do {
            try {
                sc = new Scanner(System.in);
                verthoriz = sc.nextInt();
                if (verthoriz != 0 && verthoriz != 1) {
                    throw new IllegalArgumentException();
                }
                badData = false;
            } catch (Exception e) {
                System.out.println("Enter 0 or 1.");

            }
        } while (badData);

        if (verthoriz == 0) {
            System.out.println("Choose a number between 1 and 60 to be the head of the ship.");
            int head = 0;
            badData = true;
            do {
                try {
                    sc = new Scanner(System.in);
                    head = sc.nextInt();
                    if (head < 1 || head > 60) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                } catch (Exception e) {
                    System.out.println("Choose a number between 1 and 60 to be the head of the ship.");
                }
            } while (badData);

            playerBoard.add(head);
            playerBoard.add(head + 10);
            playerBoard.add(head + 20);
            playerBoard.add(head + 30);
            playerBoard.add(head + 40);
        } else if (verthoriz == 1) {
            System.out.println("Choose a number between 1 and 100 that ends in 1-6 to be the head of the ship.");
            int head = 0;
            badData = true;
            do {
                try {
                    sc = new Scanner(System.in);
                    head = sc.nextInt();
                    String s = Integer.toString(head);
                    char S = s.charAt(1);
                    String x = Character.toString(S);
                    int letter = Integer.parseInt(x);
                    if (letter < 1 || letter > 6 || head > 100) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                } catch (Exception e) {
                    System.out.println("Choose a number between 1 and 100 that ends in 1-6 to be the head of the ship.");
                }
            } while (badData);
            playerBoard.add(head);
            playerBoard.add(head + 1);
            playerBoard.add(head + 2);
            playerBoard.add(head + 3);
            playerBoard.add(head + 4);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("The next ship is a 4, type 0 to place it vertically or 1 to place horizontally");
            badData = true;
            do {
                try {
                    sc = new Scanner(System.in);
                    verthoriz = sc.nextInt();
                    if (verthoriz != 0 && verthoriz != 1) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                } catch (Exception e) {
                    System.out.println("Enter 0 or 1.");

                }
            } while (badData);
            if (verthoriz == 0) {
                System.out.println("Choose a number between 1 and 70 to be the head of the ship.");
                int head = 0;
                badData = true;
                do {
                    try {
                        sc = new Scanner(System.in);
                        head = sc.nextInt();
                        if (head < 1 || head > 70 && playerBoard.contains(head)||playerBoard.contains(head+30)||playerBoard.contains(head+20)||playerBoard.contains(head+10)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        System.out.println("Choose a number between 1 and 70 to be the head of the ship.");
                    }
                } while (badData);
                playerBoard.add(head);
                playerBoard.add(head + 10);
                playerBoard.add(head + 20);
                playerBoard.add(head + 30);
            } else if (verthoriz == 1) {
                System.out.println("Choose a number between 1 and 100 that ends in 1-7 to be the head of the ship.");
                int head = 0;
                badData = true;
                do {
                    try {
                        sc = new Scanner(System.in);
                        head = sc.nextInt();
                        String s = Integer.toString(head);
                        char S = s.charAt(1);
                        String x = Character.toString(S);
                        int letter = Integer.parseInt(x);
                        if (letter < 1 || letter > 7 || head > 100 && playerBoard.contains(head)||playerBoard.contains(head+3)||playerBoard.contains(head+2)||playerBoard.contains(head+1)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        System.out.println("Choose a number between 1 and 100 that ends in 1-7 to be the head of the ship.");
                    }
                } while (badData);
                playerBoard.add(head);
                playerBoard.add(head + 1);
                playerBoard.add(head + 2);
                playerBoard.add(head + 3);
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("The next ship is a 3, type 0 to place it vertically or 1 to place horizontally");
            badData = true;
            do {
                try {
                    sc = new Scanner(System.in);
                    verthoriz = sc.nextInt();
                    if (verthoriz != 0 && verthoriz != 1) {
                        throw new IllegalArgumentException();
                    }
                    badData = false;
                } catch (Exception e) {
                    System.out.println("Enter 0 or 1.");

                }
            } while (badData);
            if (verthoriz == 0) {
                System.out.println("Choose a number between 1 and 80 to be the head of the ship.");
                int head = 0;
                badData = true;
                do {
                    try {
                        sc = new Scanner(System.in);
                        head = sc.nextInt();
                        if (head < 1 || head > 80 && playerBoard.contains(head)||playerBoard.contains(head+20)||playerBoard.contains(head+10)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        System.out.println("Choose a number between 1 and 80 to be the head of the ship.");
                    }
                } while (badData);
                playerBoard.add(head);
                playerBoard.add(head + 10);
                playerBoard.add(head + 20);
            } else if (verthoriz == 1) {
                System.out.println("Choose a number between 1 and 100 that ends in 1-8 to be the head of the ship.");
                int head = 0;
                badData = true;
                do {
                    try {
                        sc = new Scanner(System.in);
                        head = sc.nextInt();
                        String s = Integer.toString(head);
                        char S = s.charAt(1);
                        String x = Character.toString(S);
                        int letter = Integer.parseInt(x);
                        if (letter < 1 || letter > 8 || head > 100&& playerBoard.contains(head)||playerBoard.contains(head+2)||playerBoard.contains(head+1)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        System.out.println("Choose a number between 1 and 100 that ends in 1-8 to be the head of the ship.");
                    }
                } while (badData);                playerBoard.add(head);
                playerBoard.add(head + 1);
                playerBoard.add(head + 2);
            }
        }

        int count = 1;
        boolean playerWon = false;
        boolean computerWon = false;

        while (!playerWon & !computerWon) {
            if (count % 2 > 0) {
                int cG = computerGuess.getComputerGuess();
                if (playerBoard.contains(cG)) {
                    for (int i = 0; i < playerBoard.size(); i++) {
                        if (playerBoard.get(i) == cG) {
                            playerBoard.remove(i);
                        }
                    }
                    System.out.println("Computer Hit");
                }else{
                    System.out.println("Computer Miss");
                }
                if (playerBoard.isEmpty()) {
                    computerWon = true;
                    System.out.println("You lost");
                }
            } else if (count % 2 == 0) {
                System.out.println("Enter a number between 1 and 100 as your guess.");
                int guess = 0;
                badData = true;
                do {
                    try {
                        sc = new Scanner(System.in);
                        guess = sc.nextInt();
                        if (guess < 1 || guess > 100) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        System.out.println("Enter a number between 1 and 100 as your guess.");
                    }
                } while (badData);
                if (userBoard.userBoard.contains(guess)) {
                    for (int i = 0; i < userBoard.userBoard.size(); i++) {
                        if (userBoard.userBoard.get(i) == guess) {
                            userBoard.userBoard.remove(i);
                        }
                    }
                    System.out.println("Hit");
                } else {
                    System.out.println("Miss");
                }
                if (userBoard.userBoard.isEmpty()) {
                    playerWon = true;
                    System.out.println("Congratulations, you win!");
                }
            }
            count++;
        }
    }
}