package homework_unit5;

public class work_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.33
		int number;
		int i;
		int n=0; 
		for(number=2;number<=10000;number++)
		{
			n=0;
			for(i=1;i<number;i++)
			{
				if(number%i==0)
					n+=i;
			}
			if(number==n)
				System.out.printf("%d\n",number);
		}

	}

}
