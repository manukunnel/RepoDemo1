package abstractAndInterface;

public class UPIPayment extends Payment{

	public static void main(String[] args) {
		
		UPIPayment up = new UPIPayment();
		up.pay(789.09);
		up.display();
		// TODO Auto-generated method stub

	}


	void pay(double amount) {
		System.out.println("Paid using upi   "+ amount);
		
	}

}
