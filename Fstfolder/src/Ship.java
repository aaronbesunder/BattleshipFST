public class Ship {
    private int size;
    private int [] position;

    public Ship(int s, int [] p) {
        setSize(s);
        setPositions(p);
    }

    public void setSize (int size1) {
        this.size = size1;
    }

    public void setPositions(int [] positions) {
        this.position = positions;
    }

    public int getSize () {
        return size;
    }

    public int[] getPosition() {
        return position;
    }
}
