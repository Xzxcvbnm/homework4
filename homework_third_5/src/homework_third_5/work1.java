package homework_third_5;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.7
		double count=10000;
		double sum=0;
		int i=0;
		for(i=0;i<10;i++)
		{
			count=(1+0.05)*count;
			i++;
		}
		System.out.println("THe count after 10 years: $"+count);
		for(i=0;i<4;i++)
		{
			count=(1+0.05)*count;
			sum+=count;
			i++;
		}
		System.out.println("From now on, 10 years later, the total tuition fee within 4 years is :  " + sum);

	}

}
