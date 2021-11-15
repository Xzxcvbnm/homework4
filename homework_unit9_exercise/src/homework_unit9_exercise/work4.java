package homework_unit9_exercise;
import java.util.Random;
import java.util.Arrays;
public class work4 {

	public static void main(String[] args) {
		//9.6
		int[] array = new int[100000];
		Random randomnumbers = new Random();
		
		for(int i=0;i<array.length;i++) 
		{
			array[i] = randomnumbers.nextInt(100000);
		}
		
		Work4Class_StopWatch watch = new Work4Class_StopWatch();
		
		watch.start();
		Arrays.sort(array);
		watch.stop();
		
		System.out.println("Ö´ÐÐÊ±¼ä£º "+watch.getElaspsedTime()+" ms");

	}

}
