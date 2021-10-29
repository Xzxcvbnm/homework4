package homework_third_5;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.19
		int num=8;
		int i;
		int j1,j2,j3;
		for(i=1;i<=num;i++)
		{
			for(j1=i;j1<num;j1++)
			{
				System.out.print("    "); 
			}
			
			for(j2=0;j2<=i-1;j2++)
			{
				int count;
				count=(int)Math.pow(2, j2);
				if(count/100>0)
					System.out.printf("%d ",count);
				else if(count/10%10>0)
					System.out.printf(" %d ",count);
				else
					System.out.printf("  %d ",count);
			}
			
			if(i>1)
			{
				for(j3=i-2;j3>=0;j3--)
				{
					int count;
					count=(int)Math.pow(2, j3);
					if(count/100>0)
						System.out.printf("%d ",count);
					else if(count/10%10>0)
						System.out.printf(" %d ", count);
					else
						System.out.printf("  %d ", count);
				}
			}
			
			System.out.println("\n");
		}

	}

}
