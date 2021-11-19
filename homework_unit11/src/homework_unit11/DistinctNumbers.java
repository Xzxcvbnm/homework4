package homework_unit11;
import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		// 11-9
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner n = new Scanner(System.in);
		System.out.print("Enter integers (input ends with 0): ");
		int value;
		
		do {
			value=n.nextInt();
			
			if(!list.contains(value) && value!=0)
				list.add(value);
		}while(value!=0);
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i) + " ");

	}

}
