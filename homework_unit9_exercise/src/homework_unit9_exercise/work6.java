package homework_unit9_exercise;
import java.util.Scanner;
public class work6 {

	public static void main(String[] args) {
		//9.11
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
        double a=n.nextDouble();
        double b=n.nextDouble();
        double c=n.nextDouble();
        double d=n.nextDouble();
        double e=n.nextDouble();
        double f=n.nextDouble();
        
        Work6Class_LinearEquation answer = new Work6Class_LinearEquation(a,b,c,d,e,f);
        
        boolean flag=answer.isSolvable();
        if(flag==true)
        {
        	System.out.println("x is "+answer.getX()+" and y is "+answer.getY());
        }
        else
        {
        	System.out.println("The equation has no solution");
        }

	}

}
