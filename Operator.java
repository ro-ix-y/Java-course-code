import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Operator {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		double meal = scanner.nextDouble();
		int text = scanner.nextInt();
		int tip = scanner.nextInt();
		double text1= (meal*text)/100;
		double tip1= (meal*tip)/100;
		double cost =(text1+meal+tip1);
		System.out.println(Math.round(cost));
		
	}

}
