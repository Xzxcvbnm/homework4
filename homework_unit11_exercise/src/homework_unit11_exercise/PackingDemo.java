package homework_unit11_exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class PackingDemo {

	public static void main(String[] args) {
		//11.19
		ArrayList<Packing> packing = new ArrayList<>();
		System.out.print("Enter the number of the objects: ");
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Enter the weights of the objects: ");
        
        for(int i=0;i<n;i++){
        	double tmp = input.nextInt();
            int flag=0;
            
            for(Packing element : packing){
                if(element.weight>=tmp){
                	element.asses.add(tmp);
                	element.weight-=tmp;
                    flag=1;
                    break;
                }
            }
            
            if(flag==0) {
            	Packing elementNow = new Packing();
                elementNow.weight-=tmp;
                elementNow.asses.add(tmp);
                packing.add(elementNow);
            }
        }
        
        int index=1;
        
        for(Packing nWeight :packing){
            System.out.print("Container "+ index +" contains objects with weight ");
            index++;
            for(double x:nWeight.asses)
            {
            	String str = String.valueOf(x);
        		int idx = str.lastIndexOf(".");
        		String strNum = str.substring(0,idx);
            	int num = Integer.valueOf(strNum);
                System.out.print(num +" ");
            }
            System.out.print('\n');
        }

	}

}





