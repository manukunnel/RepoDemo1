package inheritanceex;

public class Programmer extends Employee{
	String designation="programmer";
	String name="manu";
	public void display() {
		System.out.println(designation);
		System.out.println(EMPID);
	}
	public static void main(String[] args) {
		Programmer pg = new Programmer();
		pg.display();
		pg.print();
	}
}
