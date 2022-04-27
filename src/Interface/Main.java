package Interface;

// Main class to call the functions
public class Main {

	public static void main(String[] args) {
		
		Frog frog = new Frog();
		frog.reproduce();
		frog.layeggs();
		
		System.out.println();
		
		Human human = new Human();
		human.reproduce();
		human.giveBirthAlive();

	}

}
