package homework_unit8;
import java.util.Scanner;
public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.8
		Scanner n=new Scanner(System.in);
		System.out.print("Enter the number of points: ");
        int numberOfPoints=n.nextInt();
        double[][] points=new double[numberOfPoints][2];
        int p1=0,p2=1;
        double distance=0;
        double shortestDistance=0; 
        int i,j; 
        
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (i=0;i<points.length;i++){
            points[i][0]=n.nextDouble();
            points[i][1]=n.nextDouble();
        }
        
        shortestDistance=distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for (i=0;i<points.length;i++)
        {
            for (j=i+1;j<points.length;j++)
            {
                distance=distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestDistance>distance)
                {
                    p1=i;
                    p2=j;
                    shortestDistance=distance;
                }
            }
        }
        
        for(i=0;i<points.length;i++)
        {
        	for(j=0;j<points.length;j++)
        	{
        		distance=distance(points[i][0], points[i][1], points[j][0], points[j][1]);
        		if (shortestDistance == distance)
        		{
                    System.out.println("The closest two points are "+"("+points[i][0]+", "+points[i][1]+") and ("+points[j][0]+", "+points[j][1]+")");
                }
        		
        	}
        }
        System.out.println("Their distance is "+shortestDistance);

	}
	
	public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

}
