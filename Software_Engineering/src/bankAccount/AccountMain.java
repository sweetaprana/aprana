package bankAccount;

public class AccountMain {

	public static void main(String[] args) {
		Account ac= new Account();
		System.out.println("After Deposit "+ac.deposite(100));
		System.out.println("After Withdraw "+ac.withdraw(200));
		
	}

}
