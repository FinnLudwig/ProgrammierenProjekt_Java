package maps;

import units.TerrainType;

public class Field {// class Field, a class that represents the fields of the map
	// attributes
	private int x;
	private int y;
	private boolean isOccupied;
	private boolean isHighlighted;
	private boolean isPath;
	private TerrainType terrainType;

	// constructor
	public Field(int x, int y) {
		this.x = x;
		this.y = y;
		this.isOccupied = false;
		this.isHighlighted = false;
		this.isPath = false;
	}

	// Getters and Setters
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
