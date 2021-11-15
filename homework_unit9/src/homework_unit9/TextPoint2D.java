package homework_unit9;
import java.util.Scanner;
public class TextPoint2D {

	public static void main(String[] args) {
		//9-5
		
		Scanner n = new Scanner(System.in);
		System.out.print("Enter point1's x-,y-coordinates:");
		double x1 = n.nextDouble();
		double y1 = n.nextDouble();
		System.out.print("Enter point2's x-,y-coordinates:");
		double x2 = n.nextDouble();
		double y2 = n.nextDouble();
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		System.out.println("p1 is "+p1.toString());
		System.out.println("p2 is "+p2.toString());
		System.out.println("The distance between p1 and p2 is "+ p1.distance(p2));
		System.out.println("The midpoint between p1 and p2 is "+ p1.midpoint(p2).toString());
	}

}
