import java.util.ArrayList;

public class Boards {
    public void setAIBoard() {
        ArrayList<Integer> userBoard = new ArrayList<>();
        for(int i=0;i<5;i++){
            userBoard.add((int)Math.random()*81);
        }
    }


}
