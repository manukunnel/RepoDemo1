package multiLevelInhertiance;

public class Student extends Department {
	
	int stdid=876857;

	public void issueID()
	{
		System.out.println(stdid);
		System.out.println(deptid);
		System.out.println(cid);
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.issueID();
		

	}

}
