package homework_unit7;
import java.util.Scanner;
import java.util.Arrays;
public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7.17 
		Scanner n=new Scanner(System.in);
		System.out.print("输入学生的个数：\n");
		int count = n.nextInt();
		int i=0;
		int iGrades=0;
		int grades_max=0;
		int grades_max_index=-1;
		int iIndex=0;
		int index_max=-1;
		
		double[] grades=new double[count];
		String[] names=new String[count];
		
		System.out.print("输入学生的姓名和成绩：\n");
		for(i=0;i<count;i++)
		{
			names[i]=n.next();
			grades[i]=n.nextDouble();
		}
		
		String[] names1=new String[count];
		
		for (iIndex = 0 ; iIndex < count ; iIndex++) 
		{
			for (iGrades = 0 ; iGrades < count ; iGrades++)
			{
	            if (grades_max < grades[iGrades] && grades[iGrades] >= 0)
	            {
	            	grades_max = iGrades;
	            }
			}
			
            index_max = grades_max;
            names1[iIndex]=names[index_max];
            grades[index_max]=-1;
        }
		
		System.out.print(Arrays.toString(names1));

	}

}
