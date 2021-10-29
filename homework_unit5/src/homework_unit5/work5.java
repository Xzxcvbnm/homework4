package homework_unit5;
import java.util.Scanner;
public class work5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.22
		Scanner n=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount=n.nextDouble();
		System.out.print("Number of Years: ");
		int year=n.nextInt(); 
		System.out.print("Annual Interest Rate: ");
		double rate=n.nextDouble();
		System.out.print("\n");
		
		double monthRate = 0; 
		double monthlyPayment = 0;
		double totalPayment = 0;
		
		monthRate=rate/100/12;
		monthlyPayment=amount*monthRate/( 1 - 1 / Math.pow((1 + monthRate), year * 12));
		totalPayment=monthlyPayment*12*year;
		
		System.out.printf("Monthly Payment: "+"%.2f",monthlyPayment);
		System.out.print("\n");
		System.out.printf("Total Payment: "+"%.2f",totalPayment);
		System.out.print("\n");
		System.out.print("\n");
		
		System.out.println("Payment#    Interest    Principal    Balance");
		
		double interest=0;
		double principal=0;
		double balance=amount;
		int i=0;
		
		for(i=1;i<=year*12;i++)
		{
			interest=monthRate*balance;
			principal=monthlyPayment-interest;
			balance=balance-principal;
			
			if(i<10)
				System.out.print(i+"           ");
			else
				System.out.print(i+"          ");
			System.out.printf("%5.2f"+"       "+"%6.2f"+"       "+"%7.2f",interest,principal,balance);
			System.out.print("\n");
		}
		
	}

}
