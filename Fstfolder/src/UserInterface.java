import java.util.Scanner;

public class UserInterface {
    public static void main(String [] args){

    System.out.println("Hello! Welcome to battleship.");
    System.out.print("On a 10 by 10 board, you will place five ships with different sizes either vertically or horizontally, without overlaps.");
    System.out.println("The first ship is a 5, type 0 to place it vertically or 1 to place horizontally");
    Scanner sc = new Scanner(System.in);
    int verthoriz = sc.nextInt();
    if (verthoriz == 0) {
        System.out.println("Choose a number between 1 and 100 to be the head of the ship.");
        Scanner sc1 = new Scanner(System.in);
        int head = sc.nextInt();
    }
    else if (verthoriz == 1) {

    }

    }
}
