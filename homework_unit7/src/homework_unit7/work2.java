package homework_unit7;
import java.util.Scanner;
import java.util.Arrays;
public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7.5
		Scanner n=new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int num=0; 
		int[] array=new int[10];
		int i=0,j=0;
		int count=0;
		int flag=0;
		
		for(i=0;i<10;i++)
		{
			flag=0;
			num=n.nextInt();
			
			for(j=0;j<i;j++)
			{
				if(array[j]==num)
				{
					flag=1;
				}
				
			}
			
			if(flag==0)
			{
				array[count]=num;
				count++;
			}
			
		}
		
		 System.out.println("The number of distinct numbers is: " + count);
		 System.out.print("The distinct numbers are: ");
		 for(i=0;i<count;i++)
		 {
			 System.out.print(array[i]+" ");
		 }

	}

}
