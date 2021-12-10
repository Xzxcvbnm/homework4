package homework_unit11_exercise;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		//11.17
		Scanner input = new Scanner(System.in);
	    int n=1;     
	    System.out.println("Enter a number: ");
	    int m=input.nextInt();
	    int temp=0;
	    int temp1=1;
	    for(int i=1;temp1==1;i++) 
	    {
	        if(i*i==m*n) 
	        {
	        	temp=n; 
	        	temp1=0;
	        }
	        else 
	        {
	            for(int t=n;t<=m;t++) 
	            {
	                if(t*m==i*i) 
	                {
	                	temp=t;
	                	temp1=0;
	                }
	            }
	                
	        }
	                
	    }
	    
	    System.out.println("The smallest number n for m*n to be a perfect square is " + temp);
	    System.out.println(m*temp);

	}

}
