package homework_third_5;

public class work8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.27 
		int year;
		int leapYear;
		int count=0;
		for(year=101;year<=2100;year++)
		{
			if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			{
				leapYear=year;
				count++;
				System.out.printf("%d ",leapYear);
				
				if(count%10==0)
				{
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
		System.out.print("ÈòÄêÊýÄ¿: " + count);

	}

}
