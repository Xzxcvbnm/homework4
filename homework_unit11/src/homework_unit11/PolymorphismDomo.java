package homework_unit11;

public class PolymorphismDomo {

	public static void main(String[] args) {
		// 11-5
		
		displayObject(new Circle(1,"red",false));
		displayObject(new Rectangle(1,1,"black",true));

	}
	
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}

}
