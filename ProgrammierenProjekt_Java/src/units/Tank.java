package units;
import java.util.Map;

public class Tank extends Units {

	// Constructor
	public Tank(int x, int y) {
		super(x, y);
	}
	
	// Override Getter Methods
	@Override
	public String getType() {
		return "Tank";
	}
	
	@Override
	public int getPrice() {
		return 7000;
	}
	
	@Override
	public Map<TerrainType, Integer> getMovementChart() {
		return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 2, TerrainType.MOUNTAIN, 100, TerrainType.SEA, 100);
	}
	
	@Override
	public Map<OpponentType, Integer> getDamageChart() {
		return Map.of(OpponentType.INFANTRY, 75, OpponentType.MECHANIZED_INFANTRY, 70, OpponentType.TANK, 55,
				OpponentType.MOBILE_ARTILLERY, 70, OpponentType.ANTI_AIR, 65, OpponentType.FIGHTER, 0,
				OpponentType.BOMBER, 0, OpponentType.BATTLE_COPTER, 10);
	}
	
	@Override
	public int getMovementRange() {
		return 6;
	}

	
}