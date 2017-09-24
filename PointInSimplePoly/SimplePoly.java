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
	
}
