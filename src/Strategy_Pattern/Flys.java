package Strategy_Pattern;

public interface Flys {
	String flys();
}

class Flyable implements Flys {

	public String flys() {
		return "Flying high";
	}
	
}

class NotFlyable implements Flys {

	public String flys() {
		return "Can't fly";
	}
	
}


