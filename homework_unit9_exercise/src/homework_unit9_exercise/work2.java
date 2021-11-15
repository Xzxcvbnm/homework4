package homework_unit9_exercise;
import java.util.Random;
public class work2 {

	public static void main(String[] args) {
		//9.4
		Random randomNumber = new Random(1000);
		for(int i=0;i<50;i++)
		{
			System.out.println(randomNumber.nextInt(100));
		}

	}

}
