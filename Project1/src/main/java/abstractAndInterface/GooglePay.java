package abstractAndInterface;

public class GooglePay extends Payment{

	public static void main(String[] args) {
		GooglePay gp = new GooglePay(); 
		gp.pay(65553.98);

	}

	
	void pay(double amount) {
		System.out.println("Paid using GooglePay   "+ amount);
		
	}

}
