package units;
import java.util.Map;

public class BattleCopter extends Units {

	// Constructor
	public BattleCopter (int x, int y) {
		super(x, y);
	}
	
	// Override Getter Methods
	@Override
	public String getType() {
		return "BattleCopter";
	}
	
	@Override
	public int getPrice() {
		return 9000;
	}
	
	@Override
	public Map<TerrainType, Integer> getMovementChart() {
		return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 1, TerrainType.MOUNTAIN, 1, TerrainType.SEA, 1);
	}
	@Override
	public Map<OpponentType, Integer> getDamageChart() {
		return Map.of(OpponentType.INFANTRY, 75, OpponentType.MECHANIZED_INFANTRY, 75, OpponentType.TANK, 55,
				OpponentType.MOBILE_ARTILLERY, 65, OpponentType.ANTI_AIR, 25, OpponentType.FIGHTER, 0,
				OpponentType.BOMBER, 0, OpponentType.BATTLE_COPTER, 65);
	}
	
	@Override
	public int getMovementRange() {
		return 6;
	}
	
}
