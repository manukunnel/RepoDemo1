package interfacedemo;

public class GooglePay implements Payment{

	public static void main(String[] args) {
		Payment py = new GooglePay();
		py.pay();
		py.display();
		

	}

	
	public void pay() {
		System.out.println("Interface example");
		
	}



	public void display() {
		System.out.println("Interface example in example");
		
	}

}
