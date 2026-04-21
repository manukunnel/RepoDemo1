import accessmodi.ProtectedDemo;

public class ClassBParent extends ProtectedDemo{

	public void print()
	{
		System.out.println("I am Parent B");
	}

public static void main(String[] args)
{
	ClassBParent pd = new ClassBParent();
	pd.demo();
}
}
