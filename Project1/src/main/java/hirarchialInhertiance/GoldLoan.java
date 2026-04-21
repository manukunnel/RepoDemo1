package hirarchialInhertiance;

public class GoldLoan extends Loan{
	int goldId=3;
	
	void goldDisplay() {
		System.out.println(goldId);
		System.out.println(userdid);
		
	}

	public static void main(String[] args) {
		GoldLoan gl = new GoldLoan();
		gl.goldDisplay();

	}

}
