import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		String word;
		for(int l=0;l<T;l++) {
			word=input.next();
			for(int j=0;j<word.length();j++) {
				if(j%2==0) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.print(" ");
			for(int j=0;j<word.length();j++) {
				if(j%2==1) {
					System.out.print(word.charAt(j));
				}
			}
			
		}
		System.out.println();

	}

}
