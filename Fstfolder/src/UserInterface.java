import java.util.Scanner;

public class UserInterface {
public static void main(String [] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("Hello! Welcome to battleship. If you wish to read the instructions, type in I.");
    System.out.println("If you wish to start, type in S.");

    String command=sc.nextLine();

    if(command=="I"){
        System.out.print("On a 10 by 10 board, you will place five ships with different sizes either vertically or");
        System.out.println();
    }

}
}
