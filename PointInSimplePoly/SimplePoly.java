import java.util.LinkedList;

public class SimplePoly{

    private LinkedList edges;
	
	public SimplePoly() {
		this.edges = new LinkedList();
	}

	public SimplePoly(LinkedList e) {
		edges = e;
	}
	
	public LinkedList getEdges() {return edges;}
	public void addEdge(Edge ed){ edges.add(ed); }
	
}