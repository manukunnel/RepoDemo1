package methodOverrid;

public class Dog extends Animal{
	public void Sound()
	{
		System.out.println("Inside Dog Class");
	}

	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.Sound();
		
		Animal an = new Animal();
		an.Sound();
	}

}
