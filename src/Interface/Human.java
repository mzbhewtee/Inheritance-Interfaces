package Interface;

//Create a class that implement the attributes from the interfaces, this proofs that class takes multiple interfaces
public class Human implements Animal, Mammal{

	
//	Implement the interfaces, first override the public class
	@Override
	public void reproduce() {
		System.out.print("All animals reproduce");
	}
	
	@Override
	public void giveBirthAlive() {
		System.out.println(" but Humans give birth to their babies alive!");
	}
}
