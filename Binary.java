import java.util.*;
import java.math.*;
import java.io.*;
public class Binary {
	public void binaryCalculation(int n) {
		int binaryNumber=0,Size=0,max=0;
		while(n>0) {
			binaryNumber=n%2;
			if(binaryNumber==1) {
				Size++;
			}
			else {
				Size=0;
			}
			max=Math.max(Size,max);
			n/=2;
		}
		System.out.println(max);
	}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		Binary obj=new Binary();
		obj.binaryCalculation(n);
	
		
	

	}

}
