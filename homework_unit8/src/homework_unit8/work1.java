package homework_unit8;
import java.util.Arrays;
public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.4
		int[][] workHours= {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9},
		};
		int row=8;
		int line=7;
		int sum=0;
		int i,j,k,m,n;
		int[] sumHours=new int[row];
		
		for(i=0;i<row;i++)
		{
			sum=0;
			for(j=0;j<line;j++)
			{
				sum+=workHours[i][j];
			}
			sumHours[i]=sum;
		}
		
		int[] sumHoursCopy=new int[row];
		for(k=0;k<row;k++)
		{
			sumHoursCopy[k]=sumHours[k];
		}
		Arrays.sort(sumHoursCopy);

		int[] sumHoursCopy1=new int[row]; 
		for(i=0;i<row;i++)
		{
			sumHoursCopy1[i]=sumHoursCopy[row-1-i];
		}
		
		for(m=0;m<row;m++)
		{
			for(n=0;n<row;n++)
			{
				if(sumHoursCopy1[m]==sumHours[n])
				{
					System.out.println("Employee "+n+" works "+sumHours[n]+" hours.");
					sumHours[n]=0;
				}
			}
		}

	}

}
