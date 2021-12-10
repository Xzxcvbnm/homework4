package homework_unit11_exercise;
import java.util.Scanner;
public class RepeatAdditionQuizDemo {

	public static void main(String[] args) {
		//11.16
		//不能实现输入相同答案时给出警告，试了好几次都不对
		int number1 = (int)(Math. random() * 10);
		int number2 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.print("What is "+ number1 + "+" + number2 +"?");

		int answer = input.nextInt();
		
		while(number1 + number2 != answer) 
		{
			
			System.out.print("Wrong answer. Try again. What is " + number1 + "+" + number2+ "?");
			answer = input.nextInt();
			
		}
		System.out.println("You got it!");

	}

}
