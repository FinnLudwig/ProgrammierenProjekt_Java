package game;
import java.util.Scanner;
import maps.EonSprings;
import maps.LittleIslands;
import maps.PistonDam;
import maps.GameMap;
import units.Units;
import players.Player;

public class Game {
	
	//Runde
	public static void round(Player player1, Player player2) {
		// Spieler 1 bewegt seine Truppen
		System.out.println(player1.getName() + " ist an der Reihe!");
		System.out.println("Welche Einheit soll bewegt werden?");
		
		// while schleife für die Auswahl der Einheit solange eine Unit noch movementrange hat
		int totalMovementRange = 1;
		while (totalMovementRange > 0) {
			totalMovementRange = 0;
		    for (Units unit : player1.getUnits()) {
		        totalMovementRange += unit.getMovementRange();
		    }
			if (totalMovementRange == 0) {
				break;
			}
			
			// Auswahl der Einheit, zurückgegebene Werte:
			// ausgewählte Einheit, Zielkoordinaten: x, y, selected Unit = unit
			//@Hugo @Luca müsst ihr machen 
			
			// Bewegung der Einheit, arbeite hier mit platzhaltern 
			selectedUnit.move(x,y); 
			
			//Bewegen beenden button muss noch eingebaut werden mit break weiß nicht wie das geht
		    
		}
		
		// Spieler 1 greift an
		
		for (Units unit : player1.getUnits()) {
			// Auswahl der Einheit, zurückgegebene Werte:
			// ausgewählte Einheit: selected Unit = unit
			// @Hugo @Luca müsst ihr machen

			// Angriff der Einheit, arbeite hier mit platzhaltern
			selectedUnit.attack(targetUnit);
			//angreifen beenden button muss noch eingebaut werden mit break weiß nicht wie das geht
		}
		
		
		
		
		
		// Spieler 2 bewegt seine Truppen
		System.out.println(player2.getName() + " ist an der Reihe!");
		System.out.println("Welche Einheit soll bewegt werden?");
		
		// while schleife für die Auswahl der Einheit solange eine Unit noch movementrange hat
		while (totalMovementRange > 0) {
			totalMovementRange = 0;
		    for (Units unit : player1.getUnits()) {
		        totalMovementRange += unit.getMovementRange();
		    }
			if (totalMovementRange == 0) {
				break;
			}
			
			// Auswahl der Einheit, zurückgegebene Werte:
			// ausgewählte Einheit, Zielkoordinaten: x, y, selected Unit = unit
			//@Hugo @Luca müsst ihr machen 
			
			// Bewegung der Einheit, arbeite hier mit platzhaltern 
			selectedUnit.move(x,y); 
			
			//Bewegen beenden button muss noch eingebaut werden mit break weiß nicht wie das geht
		    
		}
		
		// Spieler 2 greift an
		
		for (Units unit : player2.getUnits()) {
			// Auswahl der Einheit, zurückgegebene Werte:
			// ausgewählte Einheit: selected Unit = unit
			// @Hugo @Luca müsst ihr machen

			// Angriff der Einheit, arbeite hier mit platzhaltern
			selectedUnit.attack(targetUnit);
			//angreifen beenden button muss noch eingebaut werden mit break weiß nicht wie das geht
		}
		
		//movementrange aller Einheiten wird zurückgesetzt
		for (Units unit : player1.getUnits()) {
			unit.setMovementRange(unit.getMovementRange());
		}
		
		for (Units unit : player2.getUnits()) {
            unit.setMovementRange(unit.getMovementRange());
		}
		//Runde endet
		System.out.println("Runde beendet!");
		
            		


	}
	
	//Game startet
	public static void main(String[] args) {
		//Game wird gestartet
		System.out.println("Willkommen bei Advanced Wars!");
		System.out.println("Das 1v1 Spiel startet jetzt!");
		
        //Spieler werden erstellt
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie den Namen des ersten Spielers ein: ");
		String name1 = scanner.nextLine();
		
		System.out.println("Bitte geben Sie den Namen des zweiten Spielers ein: ");
		String name2 = scanner.nextLine();
		
		Player player1 = new Player(name1);
		Player player2 = new Player(name2);
		
		//Map wird erstellt1
		System.out.println("Welche Map soll gespielt werden?");
		System.out.println("1. EonSprings");
		System.out.println("2. PistonDam");
		System.out.println("3. Little Island");
		
		int choicemap = scanner.nextInt();
		
		if (choicemap == 1) {
			EonSprings map = new EonSprings();
		}
		else if (choicemap == 2) {
			PistonDam map = new PistonDam();
		} 
		else if (choicemap == 3) {
			LittleIslands map = new LittleIslands();
		} 
		else {
			System.out.println("Bitte geben Sie eine gültige Zahl ein!");
		}
		
        //Runde wird gestartet
		int roundcounter = 0;
		while (player1.getUnits().size() != 0 || player2.getUnits().size() != 0) {
			roundcounter++;
			System.out.println("Runde " + roundcounter + " begins!");
			round(player1, player2); 
		
			
		}
    }
	
	

}
