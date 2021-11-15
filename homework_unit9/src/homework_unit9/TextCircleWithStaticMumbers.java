package homework_unit9;

public class TextCircleWithStaticMumbers {

	public static void main(String[] args) {
		//9-7
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + CircleWithStaticMumbers.numberOfObjects);
		
		CircleWithStaticMumbers c1 = new CircleWithStaticMumbers();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of CircleWithStaticMumbers objects + (" + c1.numberOfObjects + ")");

		
		CircleWithStaticMumbers c2 = new CircleWithStaticMumbers(5);
		
		c1.radius=9;
		
		System.out.println("\nAfter creating c2 and modified c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of CircleWithStaticMumbers objects + (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of CircleWithStaticMumbers objects + (" + c2.numberOfObjects + ")");

	}

}
