package Abstract_Factory_Pattern;

public class UFOBossEnemyShipFactory implements EnemyShipFactory{
	public ESWeapon addESGun() {
		return new ESUFOBossGun();
	}

	public ESEngine addESEngine() {
		return new ESUFOBossEngine();
	}
}
