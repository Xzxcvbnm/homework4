package homework_unit9;

public class CircleWithStaticMumbers {

	//9-6
	double radius;
	static int numberOfObjects = 0;
	CircleWithStaticMumbers(){
		radius = 1;
		numberOfObjects++;
	}
		//Construct a circle with a specified radius
	CircleWithStaticMumbers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	//Return numberOfObjects
	static int getNumberOf0bjects() {
		return numberOfObjects;
	}
	//Return the area of this circle
	double getArea() {
		return radius* radius * Math.PI;
	}
}
