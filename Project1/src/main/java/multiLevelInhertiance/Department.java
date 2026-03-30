package multiLevelInhertiance;

public class Department extends College{

	int deptid=1188787;
	public void print()
	{
		System.out.println(deptid);
		System.out.println(cid);
	}
	
	public static void main(String[] args) {
		Department dpt = new Department();
		dpt.display();
	}
}
