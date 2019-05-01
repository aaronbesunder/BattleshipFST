import java.util.ArrayList;
public class Boards {
    public Boards () {

        ArrayList<Integer> userBoard = new ArrayList<>();

        int verthoriz = (int) (Math.random() * 2);
        if (verthoriz == 0) {
            int row = (int) ((Math.random() * 5) + 1);
            int column = (int) ((Math.random() * 10) + 1);
            int head = ((row * 10) + column);
            userBoard.add(head);
            userBoard.add(head + 10);
            userBoard.add(head + 20);
            userBoard.add(head + 30);
            userBoard.add(head + 40);
            Ship five = new Ship(5, head, head+10, head+20, head+30, head+40);
        } else if (verthoriz == 1) {
            int column = (int) ((Math.random() * 5) + 1);
            int row = (int) ((Math.random() * 10) + 1);
            int head = ((column * 10) + row);
            userBoard.add(head);
            userBoard.add(head + 1);
            userBoard.add(head + 2);
            userBoard.add(head + 3);
            userBoard.add(head + 4);
            Ship five = new Ship(5, head, head+1, head+2, head+3, head+4);
        }

        for (int i = 0; i < 2; i++) {
            verthoriz = (int) (Math.random() * 2);
            if (verthoriz == 0) {
                boolean badData = true;
                int head = 0;
                do {
                    try {
                        int row = (int) ((Math.random() * 6) + 1);
                        int column = (int) ((Math.random() * 10) + 1);
                        head = ((row * 10) + column);
                        if (userBoard.contains(head) || userBoard.contains(head + 10) || userBoard.contains(head + 20) || userBoard.contains(head + 30)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        badData = true;
                    }
                } while (badData);
                userBoard.add(head);
                userBoard.add(head + 10);
                userBoard.add(head + 20);
                userBoard.add(head + 30);
                if (i==0) {
                    Ship four1 = new Ship(4, head, head+10, head+20, head+30,  0);
                }
                else if (i==1) {
                    Ship four2 = new Ship(4, head, head+10, head+20, head+30,  0);
                }
            } else if (verthoriz == 1) {
                boolean badData = true;
                int head = 0;
                do {
                    try {
                        int column = (int) ((Math.random() * 5) + 1);
                        int row = (int) ((Math.random() * 10) + 1);
                        head = ((column * 10) + row);
                        if (userBoard.contains(head) || userBoard.contains(head + 1) || userBoard.contains(head + 2) || userBoard.contains(head + 3)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        badData = true;
                    }
                } while (badData);
                userBoard.add(head);
                userBoard.add(head + 1);
                userBoard.add(head + 2);
                userBoard.add(head + 3);
                if (i==0) {
                    Ship four1 = new Ship(4, head, head+1, head+2, head+3,  0);
                }
                else if (i==1) {
                    Ship four2 = new Ship(4, head, head+1, head+2, head+3,  0);
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            verthoriz = (int) (Math.random() * 2);
            if (verthoriz == 0) {
                boolean badData = true;
                int head = 0;
                do {
                    try {
                        int row = (int) ((Math.random() * 7) + 1);
                        int column = (int) ((Math.random() * 10) + 1);
                        head = ((row * 10) + column);
                        if (userBoard.contains(head) || userBoard.contains(head + 10) || userBoard.contains(head + 20)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        badData = true;
                    }
                } while (badData);
                userBoard.add(head);
                userBoard.add(head + 10);
                userBoard.add(head + 20);
                if (i==0) {
                    Ship three1 = new Ship(4, head, head+10, head+20, 0,  0);
                }
                else if (i==1) {
                    Ship three2 = new Ship(4, head, head+10, head+20, 0,  0);
                }
            } else if (verthoriz == 1) {
                boolean badData = true;
                int head = 0;
                do {
                    try {
                        int column = (int) ((Math.random() * 7) + 1);
                        int row = (int) ((Math.random() * 10) + 1);
                        head = ((column * 10) + row);
                        if (userBoard.contains(head) || userBoard.contains(head + 1) || userBoard.contains(head + 2)) {
                            throw new IllegalArgumentException();
                        }
                        badData = false;
                    } catch (Exception e) {
                        badData = true;
                    }
                } while (badData);
                userBoard.add(head);
                userBoard.add(head + 1);
                userBoard.add(head + 2);
                if (i==0) {
                    Ship three1 = new Ship(4, head, head+1, head+2, 0,  0);
                }
                else if (i==1) {
                    Ship three2 = new Ship(4, head, head+1, head+2, 0,  0);
                }
            }
        }
    }
}
