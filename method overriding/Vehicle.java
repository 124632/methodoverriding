class Vehicle {
	void start() {
		System.out.println("vehicle started...");
	}

	void drive() {
		System.out.println("driving the vehicle");
	}
	void changeGear() {
		System.out.println(" changing the gear...");
	}
}

class Bike extends Vehicle {

	void start() {
		System.out.println("1.Turn on keys\n2.press self or use kicker\n");
	}
}

class Car extends Vehicle {
	void start() {
		System.out.println("1.Turn on keys\n2.press start button\n");
	}

	void wearSeatbelt() {
		System.out.println("wear the seatbelt or pay the fine..");
	}
}