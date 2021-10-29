package homework_unit5;

public class work6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.25
		int n;
		int i=1;
		double PI=0;
		double num=0;
		for(i=10000;i<=100000;i+=10000)
		{
			
			PI=0; 
			for(n=1;n<=i;n++)
			{
				num=(1.0/(2*n-1))*4;
				if(n%2==0)
				{
					num=-1*num;
				}
				PI+=num;		
			}
			System.out.printf("i=%d,PI=%f\n", i, PI);

		}
	}

}
