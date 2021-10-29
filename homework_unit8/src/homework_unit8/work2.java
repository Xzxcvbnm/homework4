package homework_unit8;
import java.util.Scanner;
import java.util.Arrays;
public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.6
		Scanner n=new Scanner(System.in);
		double[][] a=new double[3][3];
		double[][] b=new double[3][3];
		double[][] c=new double[3][3];
		int i,j;
		System.out.print("Enter matrix1: "); 
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=n.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=n.nextDouble();
			}
		}

		c=multiplyMatrix(a,b);
		
		System.out.println("The multipication of the matrices is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			if(i==1)
			{
				System.out.print("   *   ");
			}
			else
			{
				System.out.print("       ");
			}
			
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			if(i==1)
			{
				System.out.print("   =   ");
			}
			else
			{
				System.out.print("       ");
			}
			
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			
		}

	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] c=new double[3][3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][1]*b[1][j]+a[i][2]*b[2][j]+a[i][3]*b[3][j];
			}
		}
		return c; 
		
	}

}
