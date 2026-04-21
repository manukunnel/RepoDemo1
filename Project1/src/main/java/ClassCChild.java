
public class ClassCChild extends ClassAParent, ClassBParent {
	
	public void display()
	{
		print();
	}

	public static void main(String[] args) {
		ClassCChild cc= new ClassCChild();
		cc.display();

	}

}
