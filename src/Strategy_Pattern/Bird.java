package Strategy_Pattern;

public class Bird extends Animal{
	public Bird() {
		setSound("tweet");
		
		flyingType = new Flyable();
	}
}
