package homework_third_3;
import java.util.Scanner;
public class work_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.29
		Scanner n=new Scanner(System.in);
		double x1,y1,r1;
		double x2,y2,r2;
		System.out.print("Enter circle1's center x-,y-coordinator,and radius: ");
		x1=n.nextDouble();
		y1=n.nextDouble();
		r1=n.nextDouble();
		System.out.print("Enter circle2's center x-,y-coordinator,and radius: ");
		x2=n.nextDouble();
		y2=n.nextDouble();
		r2=n.nextDouble();
		if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=Math.abs(r1-r2)&&r1>r2)
			System.out.println("circle2 is inside circle1");
		else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=Math.abs(r1-r2)&&r1>r2)
			System.out.println("circle1 is inside circle2");
		else
		{
			if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=r1+r2)
				System.out.println("circle2 overlaps circle1");
			else
				System.out.println("circle2 does not overlaps circle1");
		}

	}

}
