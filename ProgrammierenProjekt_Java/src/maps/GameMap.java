package maps;
import units.Units;
import java.util.ArrayList;

abstract public class GameMap { // class Map, a class that represents the map of the game
	//attributes
	private int width;
	private int height;
	private Field[][] fields;
	private ArrayList<Units> units;
	
    //Methods: addUnit, removeUnit
	
	//addUnit
	public void addUnit(Units unit) {
		units.add(unit);
	}
	//removeUnit
	public void removeUnit(Units unit) {
		units.remove(unit);
	}
	
	
	//Konstruktor
	public GameMap(int width, int height) {
		this.width = width;
		this.height = height;
		fields = new Field[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				fields[i][j] = new Field(i, j);
			}
		}
		units = new ArrayList<Units>();
	}
	
	//Getter and Setter
	
	//getField
	public Field getField(int x, int y) {
		return fields[x][y];
	}
	
	//setField
	public void setField(int x, int y, Field field) {
		fields[x][y] = field;
	}
	
	//getWidth
	public int getWidth() {
		return width;
	}
	
	//setWidth
	public void setWidth(int width) {
		this.width = width;
	}
	
	//getHeight
	public int getHeight() {
		return height;
	}
	
	//setHeight
	public void setHeight(int height) {
		this.height = height;
	}
	
	//getUnits
	public ArrayList<Units> getUnits() {
		return units;
	}
	//setUnits
	public void setUnits(ArrayList<Units> units) {
		this.units = units;
	}
	
	
	
	
}
