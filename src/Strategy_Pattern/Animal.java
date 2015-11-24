package Strategy_Pattern;

public class Animal {
	private int weight, height, speed;
	private String sound, food;
	public Flys flyingType;
	
	public void setWeight(int newWeight) {
		if (newWeight > 0) {
			weight = newWeight;
		} else {
			System.out.println("Weight can't be less negative or 0");
		}
	}
	public int getWeight () { return weight; }
	
	public void setHeight (int newHeight) {
		if (newHeight > 0) {
			height = newHeight;
		} else {
			System.out.println("Height can't be negative or zero");
		}
	}
	public int getHeigh () { return height; }
	
	public void setSpeed(int newSpeed) { speed = newSpeed; }
	public int getSpeed() { return speed; }
	
	public void setSound (String newSound) { sound = newSound; }
	public String getSound () { return sound; }
	
	public void setFavFood (String favFood) { food = favFood; }
	public String getFavFood() { return food; }
	
	public String howItFly() { return flyingType.flys(); }
	
	public void setFlyAbility(Flys newFlyingType) { flyingType = newFlyingType; }
	
	
}
