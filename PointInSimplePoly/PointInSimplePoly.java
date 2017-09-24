import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class PointInSimplePoly {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ArrayList<Point> vertices = getUsersCoords(scan);

        LinkedList<Edge> edges = buildEdges(vertices);

        SimplePoly shape = new SimplePoly(edges);

        Point checkPoint = makeCheckPoint(scan);

        System.out.println(checkPoint);

        scan.close();
    }

    //Get a series of coords from the user, each coord is a vertice of
    //the simple poly to be contsructed, store coords in an ArrayList
    //to be passed back to the main exectuion of the program
    public static ArrayList<Point> getUsersCoords(Scanner scan) {
		
        System.out.println("Enter a series of co-ordinates, to finish enter 'END':");
		
        ArrayList<Point> vertices = new ArrayList<Point>(10);
		
        String userInput = scan.next();
		
        while(!userInput.equals("END")) {
            String[] stringCoords = new String[2];
            stringCoords = userInput.split(",");
            int xCoord = Integer.parseInt(stringCoords[0]);
            int yCoord = Integer.parseInt(stringCoords[1]);
            Point usersPoint = new Point(xCoord,yCoord);
            vertices.add(usersPoint);
	    userInput = scan.next();
        }
		
        return vertices;
    }//end getUsersCoords

    //Given an ArrayList of Points construct a linked list
    //of edges
    public static LinkedList<Edge> buildEdges(ArrayList<Point> points) {

        LinkedList<Edge> edges = new LinkedList<Edge>();

        for(int i = 0; i<points.size()-1; i++) {
            Edge newEdge = new Edge(points.get(i), points.get(i+1));
            edges.add(newEdge);
        }

        Edge lastEdge = new Edge(points.get(points.size()-1), points.get(0));
        edges.add(lastEdge);

        return edges;

    }//end buildEdges

    public static Point makeCheckPoint(Scanner scan) {

        System.out.println("Enter a further point to be checked if it's in or out of poly:");

        String userInput = scan.next();

        int xCoord = Integer.parseInt(userInput.split(",")[0]);
        int yCoord = Integer.parseInt(userInput.split(",")[1]);

        Point checkPoint = new Point(xCoord,yCoord);

        return checkPoint;
    }	
}
