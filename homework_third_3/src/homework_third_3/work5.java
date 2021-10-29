package homework_third_3;
import java.util.Scanner;
public class work5 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.21 
		Scanner n=new Scanner(System.in);
		int year,m,q;
		int h,k,j;
		String s="";
		System.out.println("Enter year:(e.g. 2012): ");
		year=n.nextInt();
		System.out.println("Enter month:1-12: ");
		m=n.nextInt();
		System.out.println("Enter the day of the month:1-31: "); 
		q=n.nextInt();   
		if(m==1||m==2)
		{
			m=m+12;
			year=year-1;
		}
		k=year%100;
		j=year/100;
		h=(q+(26*(m+1))/10+k+k/4+j/4+5*j)%7;
		if(h==0)
			s="Saterday";
		else if(h==1)
			s="Sunday";
		else if(h==2)
			s="Monday";
		else if(h==3)
			s="Tuesday";
		else if(h==4)
			s="Wednesday";
		else if(h==5)
			s="Thursday";
		else if(h==6)
			s="Friday";
		System.out.println("Day of the week is : "+s);
	}

}
