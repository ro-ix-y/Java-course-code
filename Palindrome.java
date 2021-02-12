import java.util.*;
import java.io.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String name=input.next();
		int lengthOfName=name.length()-1;
		String answer="Yes";
		for(int i=1;i<=lengthOfName/2;i++) {
			if(name.charAt(i)==name.charAt(lengthOfName-i)) {
				continue;
			}
			else {
				answer="No";
				break;
			}
		}
		System.out.println(answer);

	}

}
