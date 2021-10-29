package homework_third_5;
import java.util.Scanner;
public class work_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.29 
		Scanner n=new Scanner(System.in);
		System.out.println("萩補秘定芸才旗燕乎定及匯爺頁佛豚叱議方忖�� ");
		int year=n.nextInt();
		int day=n.nextInt();
		int month;
		int day_max;
        
		for (month=1;month<=12;month++)
		{
			switch(month)
			{
			case 1:
				System.out.println("\t\t"+"January"+"  "+year);
				break;
			case 2:
				System.out.println("\t\t"+"Februry"+"  "+year);
				break;
			case 3:
				System.out.println("\t\t"+"March"+"  "+year);
				break;
			case 4:
				System.out.println("\t\t"+"April"+"  "+year);
				break;
			case 5:
				System.out.println("\t\t\t"+"May"+"  "+year);
				break;
			case 6:
			    System.out.println("\t\t"+"June"+"  "+year);
			    break;
			 case 7:
				System.out.println("\t\t"+"July"+"  "+year);
				break;
			 case 8:
				System.out.println("\t\t"+"August"+"  "+year);
				break;
			 case 9:
				System.out.println("\t\t"+"September"+"  "+year);
				break;
			 case 10:
				System.out.println("\t\t"+"October"+"  "+year);
				break;
			 case 11:
				System.out.println("\t\t"+"November"+"  "+year);
				break;
			 case 12:
				System.out.println("\t\t"+"December"+"  "+year);
				break;
			 default: 
				 break;
				 
			}
		
			System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
			System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				 day_max=31;
			else if(month==2)
			{
				if(((year % 4 ==0 && year % 100!=0)||(year %400 ==0)))
					day_max=29;
				else 
					day_max=28;
			}
			else
				day_max=30;
			
			day=(calendarPrint(day_max,day))%7;
			
		}
	}
	
	public static int calendarPrint(int day_max,int day)
	{
		
		int flag=0,i;
		for( i=0;i<day%7;i++)
		{
			System.out.print("\t");
			flag+=1;
		}

		for( int j=1;j<=day_max;j++)
		{	
		   System.out.print(j);
		   flag++;
		   if(flag%7==0)
		   {
			   System.out.print("\n");
		   }
		   else
			   System.out.print("\t");
		
		}
		
		System.out.println();
		System.out.println();
		return flag;

	}
	
}

