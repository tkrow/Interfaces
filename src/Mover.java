
public interface Mover {

	// no data members in interface!
	// private int x;	// Mover is not an object
	public static int x;
	
	// Any method created within an Interface
	// has to be used (at least a stub) within any
	// class that uses the interface
	public void move();
	
	
	public static void printStuff() {
		System.out.println("Stuff");
	}
	
	public default void dontHaveToImplementInClasses() {
		System.out.println("Moving.");
	}
}
