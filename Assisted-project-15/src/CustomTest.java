

public class CustomTest {
	public static void main(String args[]) {
		CustomTest obj = new CustomTest();
		try {
			int withDrawAmount = 5000;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.withdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} catch (Custom ex) {
			System.out.println("Exception Occurred. " + ex.getMessage());
		}
		finally{
			System.out.println("Complete transaction");
		}
	}
	
	void withdrawFromATM(int withDrawAmount, int accountNumber) {
		int balance = getBalanceFromAccount(accountNumber);
		if (withDrawAmount > balance) {
			throw new Custom("Insufficient Funds");
		}
	}
		int getBalanceFromAccount(int accountNumber) {
			return 1000;
		}

}
