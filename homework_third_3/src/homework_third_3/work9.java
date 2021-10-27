package homework_third_3;
import java.util.Scanner;
public class work9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.27 
		System.out.println("Enter a point's x- and y-coordinator: ");
		Scanner n=new Scanner(System.in);
		double x,y;
		x=n.nextDouble();
		y=n.nextDouble();
		
		if(x>0 && y>0 && y<((-1.0/2)*x+100))
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
 

	}

}
