import java.math.*;
import java.util.*;
import java.io.*;
import java.util.regex.*;
public class bigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum,mul;
		Scanner input=new Scanner(System.in);
		BigInteger l=new BigInteger(input.next());
		BigInteger m=new BigInteger(input.next());
		sum=l.add(m);
		mul=l.multiply(m);
		System.out.println(sum);
		System.out.println(mul);

	}

}
