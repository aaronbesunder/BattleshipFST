import java.util.ArrayList;
public class Boards {
    public static void main (String [] args) {

        ArrayList<Integer> userBoard = new ArrayList<>();

        int verthoriz =(int)(Math.random()*2);
        if(verthoriz==0) {
            int row=(int)((Math.random()*5)+1);
            int column=(int)((Math.random()*10)+1);
            int head=((row*10)+column);
            userBoard.add(head);
            userBoard.add(head+10);
            userBoard.add(head+20);
            userBoard.add(head+30);
            userBoard.add(head+40);
        }

        else if (verthoriz==1) {
            int column=(int)((Math.random()*5)+1);
            int row=(int)((Math.random()*10)+1);
            int head= ((column*10)+row);
            userBoard.add(head);
            userBoard.add(head+1);
            userBoard.add(head+2);
            userBoard.add(head+3);
            userBoard.add(head+4);
        }

        verthoriz =(int)(Math.random()*2);
        if(verthoriz==0) {
            int row=(int)((Math.random()*6)+1);
            int column=(int)((Math.random()*10)+1);
            int head=((row*10)+column);
            userBoard.add(head);
            userBoard.add(head+10);
            userBoard.add(head+20);
            userBoard.add(head+30);
        }

        System.out.println(userBoard);
    }
}
