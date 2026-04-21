package finalKeyword;

public class DemoFinal {
	final int x=90;
	
	public void show()
	{
		x=81;
		System.out.println(x);
	}

	public static void main(String[] args) {
		DemoFinal df = new DemoFinal();
		df.show();

	}

}
