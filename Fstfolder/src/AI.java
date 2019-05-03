import java.util.Random;
public class AI {
public static void main (String [] args){
    int max=100;
    int min=1;
    Random randomNum = new Random();
    int showMe = min + randomNum.nextInt(max);
    System.out.println(showMe);
}
}
