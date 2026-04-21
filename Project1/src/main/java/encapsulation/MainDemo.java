package encapsulation;

public class MainDemo {

	public static void main(String[] args) {
	BankAccount acc = new BankAccount();
	acc.setBalance(90);
	
	System.out.println(acc.getBalance());

	}

}
