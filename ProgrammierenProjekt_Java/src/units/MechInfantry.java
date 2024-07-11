package units;
import java.util.Map;

public class MechInfantry extends Units {

	// Constructor
	public MechInfantry(int x, int y) {
		super(x, y);
	}
	
	// Override Getter Methods
	@Override
	public String getType() {
		return "MechInfantry";
	}
	
	@Override
	public int getPrice() {
		return 3000;
	}
	
	@Override
	public Map<TerrainType, Integer> getMovementChart() {
		return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 1, TerrainType.MOUNTAIN, 1, TerrainType.SEA, 100);
	}
	
	@Override
	public Map<OpponentType, Integer> getDamageChart() {
		return Map.of(OpponentType.INFANTRY, 65, OpponentType.MECHANIZED_INFANTRY, 55, OpponentType.TANK, 55,
				OpponentType.MOBILE_ARTILLERY, 70, OpponentType.ANTI_AIR, 65, OpponentType.FIGHTER, 0,
				OpponentType.BOMBER, 0, OpponentType.BATTLE_COPTER, 9);
	}
	
	@Override
	public int getMovementRange() {
		return 2;
	}
	
}