class Account
{
	int no;
	String holderName;
	double balance;
	void deposit(){
		System.out.println("Account Class Deposit Call");
	}
	void withDraw(){
		System.out.println("Account Class WithDraw Call");
	}
	void roi(){
		System.out.println("5% ROI");
	}
}
/*
 * Overriding - Must be Inheritance 
 * Signature must be same
 */
class CurrentAccount extends Account{
	@Override  // Annotation (MetaData) 
	void roi(){
		System.out.println("Need to Pay ROI...");
	}
	void odLimit(){
		System.out.println("Od limit 5 Lakh");
	}
}
class SavingAccount extends Account{
	@Override
	void roi(){
		System.out.println("Customer get the ROI");
	}
}

class AccountCaller{
	void callMe(Account account){
		//Account account = new CurrentAccount();
		//CurrentAccount currentAccount = new CurrentAccount();
		account.deposit();
		account.withDraw();
		account.roi();
		if(account instanceof CurrentAccount){
		CurrentAccount ca = (CurrentAccount) account; // Downcasting
		ca.odLimit();
		}
	}
}

public class ISAAndHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountCaller ac = new AccountCaller();
		ac.callMe(new SavingAccount());
		ac.callMe(new CurrentAccount());
		
//		SavingAccount savingAccount = new SavingAccount();
//		savingAccount.withDraw();
//		savingAccount.deposit();
//		savingAccount.roi();
//		
//		System.out.println("***********************");
//		Account account = new CurrentAccount();
//		//CurrentAccount currentAccount = new CurrentAccount();
//		account.deposit();
//		account.withDraw();
//		account.roi();
		//account.odLimit();
		

	}

}
