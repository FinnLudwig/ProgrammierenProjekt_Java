package units;
import java.util.Map;

public class Fighter extends Units {

	// Constructor
	public Fighter(int x, int y) {
		super(x, y);
	}
	
	// Override Getter Methods
	
	@Override
	public String getType() {
		return "Fighter";
	}
	
	@Override
	public int getPrice() {
		return 20000;
	}
	
	@Override
	public Map<TerrainType, Integer> getMovementChart() {
		return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 1, TerrainType.MOUNTAIN, 1, TerrainType.SEA, 1);
	}
	
	@Override
	public Map<OpponentType, Integer> getDamageChart() {
		return Map.of(OpponentType.INFANTRY, 0, OpponentType.MECHANIZED_INFANTRY, 0, OpponentType.TANK, 0,
				OpponentType.MOBILE_ARTILLERY, 0, OpponentType.ANTI_AIR, 0, OpponentType.FIGHTER, 55,
				OpponentType.BOMBER, 100, OpponentType.BATTLE_COPTER, 100);
	}
	
	@Override
	public int getMovementRange() {
		return 9;
	}
	
}