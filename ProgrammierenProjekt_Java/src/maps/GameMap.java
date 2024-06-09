package maps;

abstract public class GameMap { // class Map, a class that represents the map of the game
	//attributes
	private int width;
	private int height;
	private Field[][] fields;
	
    //methods getfield, setfield, getwidth, getheight, setwidth, setheight
	//getField
	public Field getField(int x, int y) {
		return fields[x][y];
	}
	
	
	
	
}
