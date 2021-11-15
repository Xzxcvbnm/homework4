package homework_unit9;

public class Circle {
	//9-1
	
	double radius;
	
	//construct a circle with radius 1
	Circle(){
		radius=1;
	}
	
	//construct a circle with a specified radius
	Circle(double newRadius){
		radius=newRadius;
	}
	
	//return the area of this circle
	double getArea() {
		return radius*radius*Math.PI;
	}
	
	//return the perimeter of this circle
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	void setRadius(double newRadius) {
		radius=newRadius;
	}
}
