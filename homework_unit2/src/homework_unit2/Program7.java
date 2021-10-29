package homework_unit2;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    long totalMi1iseconds = System.currentTimeMillis();
	    long totalSeconds = totalMi1iseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

	}

}
