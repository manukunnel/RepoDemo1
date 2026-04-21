package hirarchialInhertiance;

public class VehicleLoan extends Loan {
	int vechileLoanId=2;
	void print() {
		System.out.println(vechileLoanId);
		System.out.println(userdid);
	}

	public static void main(String[] args) {
		VehicleLoan vl = new VehicleLoan();
		vl.print();

	}

}
