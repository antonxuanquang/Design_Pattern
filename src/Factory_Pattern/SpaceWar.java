package Factory_Pattern;

import java.util.Scanner;

public class SpaceWar {
	public static void main(String[] args) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship? (U/R/B)");
		
		while (true) {
			if (userInput.hasNextLine()) {
				String typeOfShip = userInput.nextLine();
				if (typeOfShip.equals("exit")) {
					System.out.println("Goodbye!!!");
					break;					
				} else {
					theEnemy = shipFactory.makeEnemyShip(typeOfShip);
				}
			}
			
			if (theEnemy != null) {
				doStuffWithEnemyShip(theEnemy);
			} else {
				System.out.println("Enter a U, R, or B only");
			}
		}
		
	}

	private static void doStuffWithEnemyShip(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
