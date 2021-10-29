package homework_third_5;

public class work_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.32
		int number1=(int)(Math.random()*10);
		int number2 = 0;
		int number;
		int i; 
		for(i=0;i<10;i++)
		{
			if(i!=number1)
			{
				number2=i;
				break;
			} 
		}
		number=number1*10+number2;
		System.out.println(number);

	}

}
