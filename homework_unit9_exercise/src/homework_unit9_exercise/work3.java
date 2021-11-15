package homework_unit9_exercise;
import java.util.GregorianCalendar;
public class work3 {

	public static void main(String[] args) {
		//9.5
		GregorianCalendar x = new GregorianCalendar();
		
		System.out.print(x.get(GregorianCalendar.YEAR)+"年");
		System.out.print(x.get(GregorianCalendar.MONTH)+"月");
		System.out.print(x.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		System.out.println();
		
		x.setTimeInMillis(1234567898765L);
		System.out.print(x.get(GregorianCalendar.YEAR)+"年");
		System.out.print(x.get(GregorianCalendar.MONTH)+"月");
		System.out.print(x.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		System.out.println();

	}

}
