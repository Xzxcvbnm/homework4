package homework_unit5;
import java.util.Scanner;
public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.17
		System.out.println("please input a num(1-15): ");
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		int i=1;
		for(i=1;i<=num;i++)
		{
			int j1,j2,j3;
			int x=num-i;
			if(x!=0)
			{
				for(j1=1;j1<=x;j1++)
					System.out.printf("  ");//¿Õ¸ñ
			} 
			
			for(j2=i;j2>0;j2--)
			{
				System.out.printf("%d ",j2);//i-1
			}
			
			if(i>=2)
			{
				for(j3=2;j3<=i;j3++)
				{
					System.out.printf("%d ",j3);//1-i
				}
			}
			
			System.out.println("\n");
		}

	}

}
