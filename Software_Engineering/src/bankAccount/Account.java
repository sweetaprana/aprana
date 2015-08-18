package bankAccount;

public class Account {
	
	int balance=5000;

	

	public int deposite(int i) {
		return balance+i;
		
		
	}

	public int withdraw(int ammount) {
		
		return balance-ammount;
		
		
	}
	
	
	

}
