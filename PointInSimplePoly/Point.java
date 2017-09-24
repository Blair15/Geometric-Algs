public class Point{

    private int x;
    private int y;

    public Point(int nX, int nY) {
        this.x = nX;
        this.y = nY;
    }

    public int getX(){ return this.x; }
    public int getY(){ return this.y; }

    public void setX(int nX){ this.x = nX; }
    public void setY(int nY){ this.y = nY; }

    public String toString(){
        return x + ", " + y;
    }

}