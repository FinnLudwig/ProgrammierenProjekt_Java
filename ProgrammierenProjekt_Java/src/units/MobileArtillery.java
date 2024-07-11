package units;
import java.util.Map;

public class MobileArtillery extends Units {

	// Constructor
	public MobileArtillery(int x, int y) {
		super(x, y);
	}
	
	// Override Getter Methods
	
	@Override
	public String getType() {
		return "MobileArtillery";
	}
	
	@Override
	public int getPrice() {
		return 6000;
	}
	
	@Override
	public Map<TerrainType, Integer> getMovementChart() {
		return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 2, TerrainType.MOUNTAIN, 100, TerrainType.SEA, 100);
	}
	
	@Override
	public Map<OpponentType, Integer> getDamageChart() {
		return Map.of(OpponentType.INFANTRY, 90, OpponentType.MECHANIZED_INFANTRY, 85, OpponentType.TANK, 70,
				OpponentType.MOBILE_ARTILLERY, 75, OpponentType.ANTI_AIR, 75, OpponentType.FIGHTER, 0,
				OpponentType.BOMBER, 0, OpponentType.BATTLE_COPTER, 0);
	}
	
	@Override
	public int getMovementRange() {
		return 5;
	}
	

	
}