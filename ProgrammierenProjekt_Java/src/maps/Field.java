package maps;
import units.Units;
import units.TerrainType;

public class Field {
	// attributes
	private int x;
	private int y;
	private boolean isOccupied;
	private boolean isHighlighted;
	private boolean isPath;
	private TerrainType terrainType;
	private Units unit;

	// constructor
	public Field(int x, int y) {
		this.x = x;
		this.y = y;
		this.isOccupied = false;
		this.isHighlighted = false;
		this.isPath = false;
	}

	// Getters and Setters
	// Unit
	public Units getUnit() {
		return unit;
	}
	
	public void setUnit(Units unit) {
        this.unit = unit;
        
        if (unit != null) {
            this.isOccupied = true;
        } else {
            this.isOccupied = false;
        }
        }
	
	// X
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// Y
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// IsOccupied
	public boolean getIsOccupied() {
		return isOccupied;
	}

	public void setIsOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	// IsHighlighted
	public boolean getIsHighlighted() {
		return isHighlighted;
	}

	public void setIsHighlighted(boolean isHighlighted) {
		this.isHighlighted = isHighlighted;
	}

	// IsPath
	public boolean getIsPath() {
		return isPath;
	}

	public void setIsPath(boolean isPath) {
		this.isPath = isPath;
	}
	
	// TerrainType
	public TerrainType getTerrainType() {
		return terrainType;
	}
	
	public void setTerrainType(TerrainType terrainType) {
		this.terrainType = terrainType;
	}
	
}
