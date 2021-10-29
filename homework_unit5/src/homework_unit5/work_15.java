package homework_unit5;
import java.util.Scanner;
public class work_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.38 
		System.out.print("Please enter a decimal integer: ");
		Scanner n=new Scanner(System.in);
		int decimal=n.nextInt();
		int i;
		int octonary=0;
		int remainder=0;
		for(i=1;decimal>0;i*=10)
		{
			remainder=decimal%8;
			decimal/=8;
			octonary+=remainder*i;
		}
		System.out.println("Convert to binary: "+octonary);


	}

}
