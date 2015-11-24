package Abstract_Factory_Pattern;

public class UFOEnemyShip extends EnemyShip {
	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}
	
	void makeShip() {
		System.out.println("Make enemy ship " + getName());
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
	}
}
