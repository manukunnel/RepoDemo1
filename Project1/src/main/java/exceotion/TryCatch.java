package exceotion;

public class TryCatch {

	public static void main(String[] args) {
		int i=90;
		int c=0;
		try
		{
			System.out.println(i/c);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}

}
