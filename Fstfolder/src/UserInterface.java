import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void main(String [] args) {
        boolean done = false;
        while (!done) {
            try {

        System.out.println("Hello! Welcome to battleship.");
        System.out.println("On a 10 by 10 board, you will place five ships with different sizes either vertically or horizontally, without overlaps.");
        ArrayList <Integer> playerBoard = new ArrayList<>();
        System.out.println("The first ship is a 5, type 0 to place it vertically or 1 to place horizontally:");
        Scanner sc = new Scanner(System.in);
            int verthoriz = sc.nextInt();
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

        System.out.println("The next two ships are 4, type 0 to place it vertically or 1 to place horizontally");
        for (int i = 0; i < 2; i++) {
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

        System.out.println("The next two ships are 3, type 0 to place it vertically or 1 to place horizontally");
        for (int i = 0; i < 2; i++) {
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
        boolean won = false;
        Boards userBoard = new Boards();

        while (!won) {
            if (count%2 > 0) {
                //call on AI to take turn
            }
            else if (count%2 == 0) {
                System.out.println("Enter a number between 1 and 100 as your guess.");
                Scanner sc1 = new Scanner(System.in);
                int guess = sc.nextInt();
                if (userBoard.userBoard.contains(guess)) {
                    userBoard.userBoard.remove(guess);
                }
                if (userBoard.userBoard.isEmpty()) {
                    won = true;
                    System.out.println("Congratulations, you win!");
                }
            }
            count++;
        }
            } catch (Exception e) {
                System.out.println("Invalid data");
            }
        }
    }
}
