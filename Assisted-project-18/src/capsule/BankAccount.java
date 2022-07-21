package capsule;

public class BankAccount {
	private int AccountNumber;
	private double Balance;
	private String Name;
	
	public void SetAccountNumber(int Acc_no) {
		if(this.AccountNumber>0) {
		this.AccountNumber=Acc_no;
		}
		else {
			this.AccountNumber=0;
		}
	}
	
	public void SetName(String name) {
		this.Name=name;
	}
	
	public void Printdetails() {
		System.out.println("Name:"+this.Name+"\nAccount Number:"+this.AccountNumber+"\nBalance:"+this.Balance);
	}
	

}
