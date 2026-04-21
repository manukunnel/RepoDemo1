package superKeyword;

public class ChildClass extends ParentClass {
	ChildClass()
	{
		super();
		System.out.println("Default Constructor");//3 rd use
	}

	int num=200;
	public void print()
	{
		System.out.println(num); //1st use
		System.out.println(super.num); //2nd use
		super.print();
	}
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.print();
		
		

	}

}
