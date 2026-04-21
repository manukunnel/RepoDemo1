package encapsulation;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setBalance(90);
		acc.deposit(2000);
		acc.withdraw(1000);
		System.out.println(acc.getBalance());
	}

}
