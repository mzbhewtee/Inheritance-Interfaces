package Interface;

// Create a class that implement the attributes from the interfaces, this proofs that class takes multiple interfaces
public class Frog implements Animal,Amphibians{
	
//	Implement the interfaces, first override the public class
	@Override
	public void reproduce() {
		System.out.print("All animals reproduces");
	}
	@Override
	public void layeggs() {
		System.out.println(" but Frogs do theirs differently. They lay eggs!");
	}
}
