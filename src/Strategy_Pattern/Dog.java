package Strategy_Pattern;

public class Dog extends Animal {
	
	public void digHole() {
		System.out.println("A big hole");
	}
	
	public Dog() {
		super();
		setSound("bark");
		
		flyingType = new NotFlyable();
	}
	
}
