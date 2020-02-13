class Tester {
	public static void main(String[] args) {
		System.out.println("main method started...");

		Vehicle v1 = new Vehicle();
		v1.start();
		v1.drive();
		v1.changeGear();
		System.out.println(" - - - -- - - -");

		Bike bk = new Bike();
		bk.start();  //MOR
		bk.drive();
		bk.changeGear();
		System.out.println(" - - - -- - - -");

		Car c = new Car();
		c.start();  //MOR
		c.drive();
		c.changeGear();
		System.out.println(" - - - -- - - -");

		
		System.out.println("main method ended...");
	}
}