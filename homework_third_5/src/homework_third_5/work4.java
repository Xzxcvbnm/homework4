package homework_third_5;
import java.util.Scanner;
public class work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.21
		Scanner n=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount=n.nextDouble();
		System.out.print("Number of Years: ");
		int year=n.nextInt();
		System.out.println("Interest Rate   Monthly Payment   TotalPayment");
		double interestRate = 0;
		double monthRate = 0;
		double monthlyPayment = 0;
		double totalPayment = 0;
		double i=5;
		for(i=5;i<=8;i+=0.125)
		{
			interestRate=i/100;
			monthRate=interestRate/12;
			monthlyPayment=amount*monthRate/( 1 - 1 / Math.pow((1 + monthRate), year * 12));
			totalPayment=monthlyPayment*12*year;
			
			System.out.printf("%.3f",i);
			System.out.print("%");
			System.out.printf("          %.2f            %.2f",monthlyPayment,totalPayment);
			System.out.print("\n");
		}
		

	}

}
