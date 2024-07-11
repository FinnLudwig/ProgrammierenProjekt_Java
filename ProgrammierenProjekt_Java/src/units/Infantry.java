package units;
import java.util.Map;

public class Infantry extends Units {

	// Constructor
	public Infantry(int x, int y) {
		super(x, y);
	}

	// Override Getter Methods
	@Override
    public String getType() {
        return "Infantry";
	}
	
	@Override
	public int getPrice() {
		return 1000;
	}
	
	@Override
	public Map<TerrainType, Integer> getMovementChart() {
		return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 1, TerrainType.MOUNTAIN, 2, TerrainType.SEA, 100);
	}
        
	@Override
	public Map<OpponentType, Integer> getDamageChart() {
		return Map.of(OpponentType.INFANTRY, 55, OpponentType.MECHANIZED_INFANTRY, 45, OpponentType.TANK, 5,
				OpponentType.MOBILE_ARTILLERY, 15, OpponentType.ANTI_AIR, 5, OpponentType.FIGHTER, 0,
				OpponentType.BOMBER, 0, OpponentType.BATTLE_COPTER, 7);
	}
	
	@Override
	public int getMovementRange() {
		return 3;
	}
	
    
}