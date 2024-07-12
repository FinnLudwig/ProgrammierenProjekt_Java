package maps;

import units.TerrainType;
import units.Units;

public class PistonDam {
	// attributes
	private int width = 19;
	private int height = 17;
	private Field[][] fields;

	// constructor
    public PistonDam() {
        fields = new Field[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                fields[i][j] = new Field(i, j);
            }
        }
   
		//Inititalisiere terraiin type
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				fields[i][j].setTerrainType(map[i][j]);
			}
		}
		
	}
 // Set TerrainType
    // Set TerrainType
    TerrainType[][] map = {
    	    {TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN},
    	    {TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN},
    	    {TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD},
    	    {TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.SEA, TerrainType.SEA, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.SEA, TerrainType.SEA, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD},
    	    {TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN},
    	    {TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA},
    	    {TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA},
    	    {TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA},
    	    {TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA},
    	    {TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.SEA, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN},
    	    {TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.SEA, TerrainType.SEA, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.SEA, TerrainType.SEA, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN},
    	    {TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD},
    	    {TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD},
    	    {TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.WOOD, TerrainType.WOOD, TerrainType.PLAIN, TerrainType.PLAIN, TerrainType.PLAIN}
    	};
	
	

	// Getters and Setters
	// getField
	public Field getField(int x, int y) {
		return fields[x][y];
	}

	// setField
	public void setField(int x, int y, Field field) {
		fields[x][y] = field;
	}
	
	//set terrainType
	public void setTerrainType(int x, int y, TerrainType terrainType) {
		fields[x][y].setTerrainType(terrainType);
	}
	
	//get terrainType
	public TerrainType getTerrainType(int x, int y) {
		return fields[x][y].getTerrainType();
	}
	
	//set Unit
	public void setUnit(int x, int y, Units unit) {
		fields[x][y].setUnit(unit);
	}
	
	//get Unit
	public Units getUnit(int x, int y) {
		return fields[x][y].getUnit();
	}
	
	// getWidth
	public int getWidth() {
		return width;
	}

	// setWidth
	public void setWidth(int width) {
		this.width = width;
	}

	// getHeight
	public int getHeight() {
		return height;
	}

	// setHeight
	public void setHeight(int height) {
		this.height = height;
	}
}


  
