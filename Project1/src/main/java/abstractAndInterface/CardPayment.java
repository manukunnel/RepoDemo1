package abstractAndInterface;

public class CardPayment extends Payment{

	public static void main(String[] args) {
		CardPayment cp = new CardPayment(); 
		cp.pay(65553.98);

	}


	void pay(double amount) {
		System.out.println("Paid using CardPayment   "+ amount);
		
	}

}
