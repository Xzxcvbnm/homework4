package homework_unit9;

public class TextCircleWithPrivateDataFields {

	public static void main(String[] args) {
		//9-9
		CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius()*1.1);
		
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		System.out.println("The number of objects created is "+CircleWithPrivateDataFields.getNumberOfObjects());

	}

}
