package homework_unit3;
import java.util.Scanner;
public class work2 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.9  
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		Scanner n=new Scanner(System.in);
		int i=n.nextInt();
		String s=""+i;
		int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0,d9=0,d10=0;
		d1=i/100000000%10;
		d2=i/10000000%10;
		d3=i/1000000%10;  
		d4=i/100000%10;
		d5=i/10000%10; 
		d6=i/1000%10;
		d7=i/100%10;
		d8=i/10%10;
		d9=i%10;
		d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if(d10==10)
		{
			s=s+'X';
			
		}
		else
		{
			String s10=""+d10;
			s=s+s10;
			
		}
		if(i/100000000==0)
		{
			s='0'+s;
			System.out.println("The ISBN-10 number is "+s);
		}
		else
		{
			System.out.println("The ISBN-10 number is "+s);
			
		}
	}

}
