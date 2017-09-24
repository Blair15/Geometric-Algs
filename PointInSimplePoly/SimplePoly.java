import java.util.LinkedList;

public class SimplePoly{

    private LinkedList<Edge> edges;
	
    public SimplePoly() {
        this.edges = new LinkedList<Edge>();
    }

    public SimplePoly(LinkedList<Edge> e) {
        edges = e;
    }
	
    public LinkedList<Edge> getEdges() {return edges;}
    public void addEdge(Edge ed){ edges.add(ed); }
	
    //TODO: Write algorithm which checks every edge of Poly
    //      and counts how many edges are intercepted by the
    //      line x=x_0, where x_0 is the value of the xCoord 
    //      of the point being checked. See Manber, Ch:8, p269
    public boolean isPointInside(Point checkPoint) {
        return true;
    }

}
