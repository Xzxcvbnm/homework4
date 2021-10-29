package homework_unit3;

import java.util.Scanner;
import java.util.Scanner;
public class work7 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.23
		System.out.println("Enter a point with two coordinator: ");
		Scanner n=new Scanner(System.in);
		float x,y; 
		x=n.nextInt();
		y=n.nextInt();
		if(x<=10/2&&y<=5.0/2)
			System.out.println("Point ("+x+","+y+") is in the rectangle");
		else
			System.out.println("Point ("+x+","+y+") is not in the rectangle");
  

	} 

}
