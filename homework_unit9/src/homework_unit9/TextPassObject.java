package homework_unit9;

public class TextPassObject {
	
	public static void main(String[] args) {
		//9-10
		CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(1);
		int n=5;
		printAreas(myCircle,n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);

	}
	
	public static void printAreas(CircleWithPrivateDataFields c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}