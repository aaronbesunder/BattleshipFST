import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static AI computerGuess = new AI();
    public static void main(String [] args) {
        computerGuess = new AI();
        Boards userBoard = new Boards();
        System.out.println(userBoard.userBoard);

        System.out.println("Hello! Welcome to battleship.");
        System.out.println("On a 10 by 10 board, you will place five ships with different sizes either vertically or horizontally, without overlaps.");
        ArrayList <Integer> playerBoard = new ArrayList<>();
        System.out.println("The first ship is a 5, type 0 to place it vertically or 1 to place horizontally:");
        Scanner sc = new Scanner(System.in);

        int verthoriz = 0;
        boolean badData= true;
        do {
            try {
                sc = new Scanner(System.in);
                verthoriz = sc.nextInt();
                if (verthoriz!=0 && verthoriz!=1) {
                    throw new IllegalArgumentException();
                }
                badData = false;
            }catch(Exception e) {
                System.out.println("Enter 0 or 1.");
            }
        }
        while(badData);
        if (verthoriz == 0) {
            System.out.println("Choose a number between 1 and 60 to be the head of the ship.");
            int head = sc.nextInt();
            playerBoard.add(head);
            playerBoard.add(head + 10);
            playerBoard.add(head + 20);
            playerBoard.add(head + 30);
            playerBoard.add(head + 40);
        } else if (verthoriz == 1) {
            System.out.println("Choose a number between 1 and 100 that ends in 1-5 to be the head of the ship.");
            int head = sc.nextInt();
            playerBoard.add(head);
            playerBoard.add(head + 1);
            playerBoard.add(head + 2);
            playerBoard.add(head + 3);
            playerBoard.add(head + 4);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("The next ship is a 4, type 0 to place it vertically or 1 to place horizontally");
            verthoriz = sc.nextInt();
            if (verthoriz==0){
                System.out.println("Choose a number between 1 and 70 to be the head of the ship.");
                int head = sc.nextInt();
                playerBoard.add(head);
                playerBoard.add(head+10);
                playerBoard.add(head+20);
                playerBoard.add(head+30);
            }
            else if (verthoriz == 1) {
                System.out.println("Choose a number between 1 and 100 that ends in 1-6 to be the head of the ship.");
                int head = sc.nextInt();
                playerBoard.add(head);
                playerBoard.add(head+1);
                playerBoard.add(head+2);
                playerBoard.add(head+3);
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("The next ship is a 3, type 0 to place it vertically or 1 to place horizontally");
            verthoriz = sc.nextInt();
            if (verthoriz==0){
                System.out.println("Choose a number between 1 and 80 to be the head of the ship.");
                int head = sc.nextInt();
                playerBoard.add(head);
                playerBoard.add(head+10);
                playerBoard.add(head+20);
            }
            else if (verthoriz == 1) {
                System.out.println("Choose a number between 1 and 100 that ends in 1-7 to be the head of the ship.");
                int head = sc.nextInt();
                playerBoard.add(head);
                playerBoard.add(head+1);
                playerBoard.add(head+2);
            }
        }

        int count = 1;
        boolean playerWon = false;
        boolean computerWon = false;

        while (!playerWon & !computerWon) {
            if (count%2 > 0) {
                int cG = computerGuess.getComputerGuess();
                if (playerBoard.contains(cG)) {
                    for (int i=0; i<playerBoard.size(); i++) {
                        if (playerBoard.get(i) == cG) {
                            playerBoard.remove(i);
                        }
                    }
                    System.out.println("Computer hit");
                }
                else {
                    System.out.println("Computer miss");
                }
                if (playerBoard.isEmpty()) {
                    computerWon = true;
                    System.out.println("You lost");
                }
            }
            else if (count%2 == 0) {
                System.out.println("Enter a number between 1 and 100 as your guess.");
                Scanner sc1 = new Scanner(System.in);
                int guess = sc.nextInt();
                if (userBoard.userBoard.contains(guess)) {
                    for (int i=0; i<userBoard.userBoard.size(); i++) {
                        if (userBoard.userBoard.get(i) == guess) {
                            userBoard.userBoard.remove(i);
                        }
                    }
                    System.out.println("Hit");
                }
                else {
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
