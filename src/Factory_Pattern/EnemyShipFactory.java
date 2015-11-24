package Factory_Pattern;

public class EnemyShipFactory {
	public EnemyShip makeEnemyShip(String newShipType) {
		EnemyShip newShip = null;
		switch (newShipType) {
		case "U": return new UFOEnemyShip();
		case "u": return new UFOEnemyShip();
		case "R": return new RocketEnemyShip();
		case "r": return new RocketEnemyShip();
		case "B": return new BigUFOEnemyShip();
		case "b": return new BigUFOEnemyShip();
		default: return null;
		}
	}
}
