import java.util.Scanner;
import java.util.ArrayList;

public class PointInSimplePoly {

    public static void main(String[] args){

		ArrayList<Point> vertices = getUsersCoords();

		for(int i = 0; i<vertices.size(); i++) {
		    System.out.println(vertices.get(i));	
		}

    }

    //Get a series of coords from the user, each coord is a vertice of
    //the simple poly to be contsructed, store coords in an ArrayList
    //to be passed back to the main exectuion of the program
    public static ArrayList<Point> getUsersCoords() {
    
        Scanner scan = new Scanner(System.in);
		
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
        scan.close();
		
        return vertices;
    }//end getUsersCoords

    //Given an ArrayList of String representations of points, return
    //an ArrayList
    //public static ArrayList<Point> constructPoints(ArrayList<String> stringPoints) {



    //}//end constructPoints
	
}
