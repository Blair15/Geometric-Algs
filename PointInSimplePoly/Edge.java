public class Edge{
	
    private Point p1;
    private Point p2;
	
    public Edge(Point point1, Point point2) {
	p1 = point1;
        p2 = point2;
    }
	
    public Point getP1(){ return p1; }
    public Point getP2(){ return p2; }

    public String toString(){
        return getP1() + "--" + getP2();
    }
}
