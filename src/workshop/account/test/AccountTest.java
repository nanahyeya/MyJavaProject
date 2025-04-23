package workshop.account.test;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] arg) {
		Account account = new Account("A1100", "221--22-3477", 100000);
		System.out.println(account); //(account.toString());
		System.out.println("°í°´ ¹øÈ£ : " + account.getCustId());
		System.out.println("°èÁÂ ¹øÈ£ : " + account.getAcctId());
		System.out.println("ÀÜ¾× : " + account.getBalance());
		
		System.out.println("10000¿ø ÀÔ±Ý");
		account.deposit(10000);
		System.out.println("ÀÜ¾× : " + account.getBalance());
		
		System.out.println("20000¿ø Ãâ±Ý");
		try {
			account.withdraw(20000);
			System.out.println("ÀÜ¾× : " + account.getBalance());
			
			account.withdraw(100000);
			System.out.println("ÀÜ¾× : " + account.getBalance());

		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

		
		
	}

	
}
