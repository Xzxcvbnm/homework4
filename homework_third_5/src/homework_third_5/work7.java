package homework_third_5;

public class work7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.26
		int i;
		int n;
		double e=1.0;
		double item=1.0;
		for(i=10000;i<=100000;i+=10000)
		{
			item=1.0;
			for(n=1;n<=i;n++)
			{
				item/=n;
				e+=item;
			}
			System.out.printf("i=%d,e=%f\n",i,e);
		}

	}

}
