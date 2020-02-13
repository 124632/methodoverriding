class MobilePhone {
	void unlock() {
		System.out.println(" unlock the mobile...");
	}
	void dialNumber() {
		System.out.println(" dial a number to make a call...");
	}
	void sendsms() {
		System.out.println(" send sms...");
	}
	void receiveCall() {
		System.out.println(" recive a call to communicate...");
	}
}
class Basicset extends MobilePhone {
	void unlock() {
		System.out.println(" unlock the mobile by press * button....");
	}
	void sendsms() {
		System.out.println(" send sms by press message key....");
	}
}
class smartphone extends MobilePhone {
	void unlock() {
		System.out.println("unlock the mobile through swipe the screen...");
	}
	void sendsms() {
		System.out.println(" send sms by using message aplication....");
	}
}
class Tester {
	public static void main(String[] args) {
	System.out.println(" main method started....");
	new MobilePhone().unlock();
	new MobilePhone().sendsms();
	new MobilePhone().receiveCall();
	System.out.println("  - - - - - -");
	new Basicset().unlock();
	new Basicset().sendsms();
	System.out.println("  - - - - - -");
	new smartphone().unlock();
	new smartphone().sendsms();
	System.out.println(" main method ended....");
	}
}