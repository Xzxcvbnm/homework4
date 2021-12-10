package homework_unit2;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers:");
		double numberl = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double average = (numberl + number2 + number3) / 3;
		System.out.println("The average of " + numberl + " " + number2 + " " + number3 + " is " + average);

	}

}
 