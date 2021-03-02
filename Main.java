import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Acount No:");
		long acNo=sc.nextLong();
		System.out.println("Enter username:");
		String userName=sc.next();
		System.out.println("Enter Credit:");
		double credit=sc.nextDouble();
		System.out.println("Enter Debit:");
		double debit=sc.nextDouble();
		BankInfo BankInfo=new BankInfo(acNo,userName,credit,debit);
		System.out.println(BankInfo.getAcNo());
		System.out.println(BankInfo.getName());
		System.out.println(BankInfo.getCredit());
		System.out.println(BankInfo.getDebit());
		

	}

}
