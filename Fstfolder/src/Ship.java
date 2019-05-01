public class Ship {
    private int size;
    private int position1;
    private int position2;
    private int position3;
    private int position4;
    private int position5;


    public Ship (int s, int p1, int p2, int p3, int p4, int p5) {
        setSize(s);
        setPosition1(p1);
        setPosition2(p2);
    }

    public void setSize (int size1) {
        this.size = size1;
    }

    public int getSize () {
        return size;
    }

    public void setPosition1(int positions1) {
        this.position1 = positions1;
    }

    public int getPosition1() {
        return position1;
    }

    public void setPosition2 (int positions2) {
        this.position2 = positions2;
    }

    public int getPosition2() {
        return position2;
    }

    public void setPosition3 (int positions3) {
        this.position3 = positions3;
    }

    public int getPosition3() {
        return position3;
    }

    public void setPosition4 (int positions4) {
        this.position4 = positions4;
    }

    public int getPosition4() {
        return position4;
    }

    public void setPosition5 (int positions5) {
        this.position5 = positions5;
    }

    public int getPosition5() {
        return position5;
    }

}
