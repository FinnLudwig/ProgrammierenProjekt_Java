package units;
import java.util.Map;

public class Bomber extends Units {

	// Constructor 
	public Bomber (int price, int health, int damage, int attackRange, int movementRange, int location, String type,
    Map<TerrainType, Integer> movementChart, Map<OpponentType, Integer> damageChart) {
    		
	super(price, health, damage, attackRange, movementRange, location, type, movementChart, damageChart);
	}
	

}