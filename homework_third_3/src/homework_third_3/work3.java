package homework_third_3;
import java.util.Scanner;
public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.15
		int number=(int)(Math.random()*1000);
		System.out.print("Entera 3 digit integer:");
		Scanner n=new Scanner(System.in);
		int i=n.nextInt();
		int n1,n2,n3;
		int d1,d2,d3;
		int t;
		int j; 
		n1=number/100;
		n2=number/10%10;
		n3=number%10;
		d1=i/100;
		d2=i/10%10;
		d3=i%10;
		System.out.println("The lottery number is "+number);
		if(i==number)
			System.out.print("Exact match:You win $10000");
		else if(d1==n1&&d2==n3&&d3==n2||d1==n3&&d2==n2&&d3==n1||d1==n2&&d2==n1&&d3==n3)
			System.out.print("Match all digits:You win $3000");
		else if(d1==n1||d1==n2||d1==n3||d2==n1||d2==n2||d2==n3||d3==n1||d3==n2||d3==n3)
			System.out.print("Match one digit:You win $1000");
		else
			System.out.print("Sorry,no match");
	}

}
