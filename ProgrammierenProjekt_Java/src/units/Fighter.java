package units;
import java.util.Map;

public class Fighter extends Units {

	// Constructor 
	public Fighter(int price, int health, int damage, int attackRange, int movementRange, int x, int y, String type,
			Map<TerrainType, Integer> movementChart, Map<OpponentType, Integer> damageChart) {
		super(price, health, damage, attackRange, movementRange, x, y, type, movementChart, damageChart);
	}
	

}