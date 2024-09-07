package Week05CodingAssignment;


public class App {

	public static void main(String[] args) {
		
		// instance of each class from Logger interface
		Logger astGreet = new AsteriskLogger("Can Hello be an error?");
		Logger spaceGreet = new SpacedLogger("Why is Hello so wrong!?");
		
		
		// Test AsteriskLogger methods
		astGreet.log("Hello");
		System.out.println();
		astGreet.error("Errorness hello. Huh?");
		
		System.out.println();
		System.out.println("Checking SpacedLogger methods:");
		System.out.println();
		
		// Tests SpacedLogger methods
		spaceGreet.log("Well HELLO there!");
		System.out.println();
		spaceGreet.error("Why is Hello so wrong!");

	}

}
