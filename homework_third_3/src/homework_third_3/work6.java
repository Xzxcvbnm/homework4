package homework_third_3;
import java.util.Scanner;
public class work6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.22
		System.out.println("Enter a point with two coordinator: ");
		Scanner n=new Scanner(System.in);
		float x,y;
		x=n.nextInt();
		y=n.nextInt();
		if(x*x+y*y<=100)
			System.out.println("Point ("+x+","+y+") is in the circle");
		else
			System.out.println("Point ("+x+","+y+") is not in the circle");

	}

}
