package problem;

import java.util.Scanner;
import java.math.*;

public class Problem {
	int i;
	double avg,sum=0;
	
	public void userArray() {
		Scanner userScanner=new Scanner(System.in);
		int arraySize=userScanner.nextInt();
		double uArray[];
		uArray=new double [arraySize];
		for( i=0;i<arraySize;i++) {
			
			uArray[i]=userScanner.nextDouble();
			
			sum+=uArray[i];
			
			
		}avg=sum/uArray.length;	
   
	   
   }
	public void display() {
		System.out.println(sum);
		System.out.println(Math.round(avg));
		
		
	}
	
		
   

}

