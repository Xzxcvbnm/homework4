package homework_unit9;

public class CircleWithPrivateDataFields {
	//9-8
	private double radius=1;
	private static int numberOfObjects=0;
	
	public CircleWithPrivateDataFields(double newRadius) {
		radius=newRadius;
		newRadius++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius=(newRadius>=0) ? newRadius:0;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
