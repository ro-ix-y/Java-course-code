import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.time.*;
import java.security.*;
import java.time.*;
public class stringToint {
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int array[];
		array =new int [n];
		String [] arrayItems=scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int i=0;i<n;i++) {
			int arrayItem=Integer.parseInt(arrayItems[i]);
			array[i]=arrayItem;
		}
		for(int s=array.length-1;s>=0;s--) {
			System.out.print(array[s]+ " ");
			
		}
		scanner.close();

	}

}
