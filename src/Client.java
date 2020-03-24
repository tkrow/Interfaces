
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		System.out.println("car.x: " + car.x);	// Not recommended
		System.out.println("Mover.x: " + Mover.x);
		//car.x = 6;
		Mover.x = 6;
	}

}
