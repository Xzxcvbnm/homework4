package homework_third_5;
import java.util.Scanner;
public class work9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.28
		Scanner n=new Scanner(System.in);
		System.out.println("请输入年份和代表该年第一天是星期几的数字： "); 
		int year=n.nextInt();
		int day=n.nextInt();
		int month;
		int week;
		int i=day;
		String str1="";
		String str2="";
				
		for(month=1;month<=12;month++)
		{
			if((year%4==0 && year%100!=0) || (year%400==0))
			{
				if (month > 2)
					day+=1;
			}
			
			switch(month)
			{
			case 1:
			{
				str1="January 1,";
				break;
			}
			case 2:
			{
				day+=31;
				str1="February 1,";
				break;
			}
			case 3:
			{
				day+=28;
				str1="March 1,";
				break;
			}
			case 4:
			{
				day+=31;
				str1="April 1,";
				break;
			}
			case 5:
			{
				day+=30;
				str1="May 1,";
				break;
			}
			case 6:
			{
				day+=31;
				str1="June 1,";
				break;
			}
			case 7:
			{
				day+=30;
				str1="July 1,";
				break;
			}
			case 8:
			{
				day+=31;
				str1="August 1,";
				break;
			}
			case 9:
			{
				day+=31;
				str1="September 1,";
				break;
			}
			case 10:
			{
				day+=30;
				str1="October 1,";
				break;
			}
			case 11:
			{
				day+=31;
				str1="November 1,";
				break;
			}
			case 12:
			{
				day+=30;
				str1="December 1,";
			}
			}
			
			week=day%7;
			
			switch(week)
			{
			case 1:
				str2="is Monday";
				break;
			case 2:
				str2="is Tuesday";
				break;
			case 3:
				str2="is Wednesday";
				break;
			case 4:
				str2="is Thursday";
				break;
			case 5:
				str2="is Friday";
				break;
			case 6:
				str2="is Saterday";
				break;
			case 0:
				str2="is Sunday";
				break;
			}
			
			System.out.println(str1+" "+year+" "+str2);
			
			str1 = "";
            str2 = "";

		}
		
		
	}

}
