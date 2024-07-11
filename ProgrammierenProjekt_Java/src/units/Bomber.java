package units;
import java.util.Map;

public class Bomber extends Units {

	// Constructor
	public Bomber(int x, int y) {
		super(x, y);
	}
	
	// Override Getter Methods
	@Override
	public String getType() {
		return "Bomber";
	}
	
	@Override
	public int getPrice() {
		return 22000;
	}
	
	@Override
	public Map<TerrainType, Integer> getMovementChart() {
		return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 1, TerrainType.MOUNTAIN, 1, TerrainType.SEA, 1);
	}
	
	
	@Override 
	public Map<OpponentType, Integer> getDamageChart() {
		return Map.of(OpponentType.INFANTRY, 110, OpponentType.MECHANIZED_INFANTRY, 110, OpponentType.TANK, 105,
				OpponentType.MOBILE_ARTILLERY, 105, OpponentType.ANTI_AIR, 95, OpponentType.FIGHTER, 0,
				OpponentType.BOMBER, 0, OpponentType.BATTLE_COPTER, 0);
	}
	
	@Override
	public int getMovementRange() {
		return 7;
	}
	
	
	

}