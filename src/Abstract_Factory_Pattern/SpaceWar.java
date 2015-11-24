package Abstract_Factory_Pattern;

import java.util.Scanner;

public class SpaceWar {
	public static void main(String[] args) {
		
		EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
		
	}
}
