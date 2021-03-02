
public class BankInfo {
	private long acNo;
	private String userName;
	private double credit;
	private double debit;
	BankInfo(long acNo,String userName,double credit,double debit){
		this.acNo=acNo;
		this.userName=userName;
		this.credit=credit;
		this.debit=debit;
	}
	public long getAcNo() {
		return acNo;
	}
	public String getName() {
		return userName;
	}
	public double getCredit() {
		return credit;
	}
	public double getDebit() {
		return debit;
	}
	

}
