package Inheritance;

// Main class to call the functions
public class Main {

	public static void main(String[] args) {
		
//		Create a new instance for the children and call the attributes alongside
		
		
		Dog dog = new Dog("German Shephard", "Bark! Bark!", "swoooosh");
		System.out.println("Dog Info:");
		System.out.println("Name: "+dog.getName());
		System.out.println("Communication: "+dog.getTalk());
		System.out.println("Movement: "+dog.getWalk());
		System.out.println();
		System.out.println("Our Animal have something to say😎😎");
		dog.see();
		dog.tail();
		System.out.println();
		System.out.print("Note: ");
		dog.type();
		
		System.out.println("\n\n");
		Snake snake = new Snake("Python", "Hiss! Hiss!", "smiiii");
		System.out.println("Snake Info:");
		System.out.println("Name: "+snake.getName());
		System.out.println("Communication: "+snake.getTalk());
		System.out.println("Movement: "+snake.getWalk());
		System.out.println();
		System.out.println("Our Animal have something to say😎😎");
		snake.see();
		snake.tail();
		System.out.println();
		System.out.print("Note: ");
		snake.type();
		
		System.out.println("\n\n");
		Bird bird = new Bird("Parrot", "Talk! Talk!", "wooshh");
		System.out.println("Bird Info:");
		System.out.println("Name: "+bird.getName());
		System.out.println("Communication: "+bird.getTalk());
		System.out.println("Movement: "+bird.getWalk());
		System.out.println();
		System.out.println("Our Animal have something to say😎😎");
		bird.see();
		bird.tail();
		System.out.println();
		System.out.print("Note: ");
		bird.type();
	}

}
