import java.util.*;
public class anagram {
	static boolean isAnagram(String A,String B) {
		Boolean ret = false;
		if(A!=null && B!=null) {
			char[]arrayA=A.toLowerCase().toCharArray();
			char[]arrayB=B.toLowerCase().toCharArray();
			Arrays.sort(arrayA);
			Arrays.sort(arrayB);
			ret=Arrays.equals(arrayA,arrayB);
		}
		return ret;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		sc.close();
		boolean ret=isAnagram(a,b);
		System.out.println((ret)? "Anagram": "Not Anagram");

	}

}
