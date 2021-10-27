package homework_third_5;
import java.util.Scanner;
public class work_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.45
		System.out.print("Enter 10 numbers: ");
		Scanner n=new Scanner(System.in);
		int i;
		double sum=0,squareSum=0,squareOfSum=0;
		double average=0,variance=0;
		for(i=0;i<10;i++)
		{
			double number=n.nextDouble();
			sum+=number;
			squareSum+=Math.pow(number, 2);
		}
		squareOfSum=Math.pow(sum, 2);
		average=sum/10;
		variance=Math.sqrt((squareSum-(squareOfSum/10))/(10-1));
		
		System.out.println("The mean is "+average);
		System.out.printf("The standard deviation is %.5f",variance);
		
	}

}
