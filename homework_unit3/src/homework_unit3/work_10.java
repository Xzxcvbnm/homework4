package homework_unit3;
import java.util.Scanner;
public class work_10 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.28 
		Scanner n=new Scanner(System.in);
		double x1,y1,width1,height1;
		double x2,y2,width2,height2;
		System.out.print("Enter r1's center x-,y-coordinator,width and height: ");
		x1=n.nextDouble();
		y1=n.nextDouble();  
		width1=n.nextDouble();
		height1=n.nextDouble();
		System.out.print("Enter r2's center x-,y-coordinator,width and height: ");
		x2=n.nextDouble(); 
		y2=n.nextDouble();
		width2=n.nextDouble(); 
		height2=n.nextDouble();
		if(width1>=width2&&height1>=height2&&Math.abs(x1-x2)<=width1&&Math.abs(y1-y2)<=height1)
			System.out.println("r2 is inside r1");
		else if(width2>=width1&&height2>=height1&&Math.abs(x1-x2)<=width2&&Math.abs(y1-y2)<=height2)
			System.out.println("r1 is inside r2");
		else
		{
			if(Math.abs(x1-x2)<=(width1+width2)/2&&Math.abs(y1-y2)<=(height1+height2)/2)
				System.out.println("r2 overlaps r1");
			else
				System.out.println("r2 does not overlaps r1");
		}
		
		

	}

}
