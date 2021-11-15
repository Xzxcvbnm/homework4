package homework_unit9_exercise;
import java.util.Scanner;
public class work5 {

	public static void main(String[] args) {
		//9.10
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
        double a=n.nextDouble();
        double b=n.nextDouble();
        double c=n.nextDouble();
        
        Work5Class_QuadraticEquation answer = new Work5Class_QuadraticEquation(a,b,c);
        
        double result=answer.getDiscriminant();
        
        if(result>0)
        {
        	System.out.printf("%.3f %.3f\n",answer.getRoot1(),answer.getRoot2());
        }
        else if(result==0)
        {
        	System.out.printf("%.3f\n",answer.getRoot1());
        }
        else
        {
        	System.out.println("The equation has no roots");
        }

	}

}
