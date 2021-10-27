package homework_forth_7;
import java.util.Scanner;
import java.util.Arrays;
public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7.3
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		int num=n.nextInt();
		int[] array=new int[100];
		int i=0;
		int count=0;
		
		int cnt=0; //¼ÆÊý
		int number=0;
		
		while(num!=0)
		{
			array[i]=num;
			i++;
			num=n.nextInt();
			count++;
		}
		
		int[] array1=new int[count];
		
		for(i=0;i<count;i++)
		{
			array1[i]=array[i];
		}
		
		Arrays.sort(array1);

		for(i=0;i<array1.length;i++)
		{
			
			if (i == 0){
				number = array1[i];
                cnt = 1;
                continue;   
            }
			
			if(number!=array1[i])
			{
				if(cnt>1)
					System.out.println(number + " occurs " + cnt + " times");
				else
					System.out.println(number + " occurs " + cnt + " time");

				number=array1[i];
				cnt=1;
				
			}
			else
			{
				cnt++;
			}
				
		}
		
		if(cnt>1)
			System.out.println(number + " occurs " + cnt + " times");
		else
			System.out.println(number + " occurs " + cnt + " time");

	}

}
