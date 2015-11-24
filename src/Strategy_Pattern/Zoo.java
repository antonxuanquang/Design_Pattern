package Strategy_Pattern;

public class Zoo {
	public static void main(String[] args) {
		Animal barky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println(barky.howItFly());
		System.out.println(tweety.howItFly());
		
		barky.setFlyAbility(new Flyable());
		
		System.out.println(barky.howItFly());
	}
}
