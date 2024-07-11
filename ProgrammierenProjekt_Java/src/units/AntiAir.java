
package units;
import java.util.Map;

public class AntiAir extends Units {

    // Konstruktor
    public AntiAir(int x, int y) {
        super(x, y);
    }

    // Überschreiben der Getter-Methoden
    @Override
    public String getType() {
        return "AntiAir";
    }

    @Override
    public int getPrice() {
        return 8000;
    }

    @Override
    public Map<TerrainType, Integer> getMovementChart() {
        return Map.of(TerrainType.PLAIN, 1, TerrainType.WOOD, 2, TerrainType.MOUNTAIN, 100, TerrainType.SEA, 100);
    }

    @Override
    public Map<OpponentType, Integer> getDamageChart() {
        return Map.of(OpponentType.INFANTRY, 105, OpponentType.MECHANIZED_INFANTRY, 105, OpponentType.TANK, 25, OpponentType.MOBILE_ARTILLERY, 50, OpponentType.ANTI_AIR, 45, OpponentType.FIGHTER, 65, OpponentType.BOMBER, 75, OpponentType.BATTLE_COPTER, 120);
    }

    @Override
    public int getMovementRange() {
        return 6;
    }
}

