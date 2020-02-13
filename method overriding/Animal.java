class Animal {
	void Eating() {
		System.out.println(" Eating food...");
	}
	void makesounds() {
		System.out.println(" sound made by animals.....");
	}
}
class wildAnimals extends Animal {
	void Eating() {
		System.out.println(" wildanimals eat hunted animals....");
	}
}
class DomesticAnimals extends Animal {
	void Eating() {
		System.out.println(" domestic animals eat leaves....");
	}
}
class Tester {
	public static void main(String[] args) {
	System.out.println(" main method started...");
	new Animal().Eating();
	new Animal().makesounds();
	System.out.println(" - - - - - - - - -");
	new wildAnimals().Eating();
	System.out.println("main method ended..");
	}
}
