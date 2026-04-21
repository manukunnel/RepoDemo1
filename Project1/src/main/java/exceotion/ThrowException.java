package exceotion;

public class ThrowException {

	public static void main(String[] args) {
		ThrowException tw = new ThrowException();
		try {
			tw.validation(1);
		}catch(InvalidAgeException ae)
		{
			ae.printStackTrace();
		}

	}
	public void validation(int age) throws ArithmeticException, InvalidAgeException
	{
		if (age > 18)
		{
			System.out.println("eligible to vote");
		}
		else 
		{
			throw new InvalidAgeException("not eligible  for voting");
		}
	}

}
