package homework_third_5;
import java.util.Scanner;
public class work_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.37
		System.out.print("Please enter a decimal integer: ");
		Scanner n=new Scanner(System.in);
		int decimal=n.nextInt();
		int i;
		int binary=0;
		int remainder=0;
		for(i=1;decimal>0;i*=10)
		{
			remainder=decimal%2;
			decimal/=2;
			binary+=remainder*i;
		}
		System.out.println("Convert to binary: "+binary);

	}

}
