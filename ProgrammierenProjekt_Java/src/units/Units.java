package units;
import java.util.Map;
import maps.Field;
import maps.GameMap;
import java.util.HashMap;

public abstract class Units {
	// Attributes: Price, Health, Damage, AttackRange, MovementRange, Location, Type, MovementChart, AttackChart
	private int price;
	private int health;
	private int damage;
	private int attackRange;
	private int movementRange;
	private int X;
	private int Y;
	private String type;
	private Map<TerrainType, Integer> movementChart;
	private Map<OpponentType, Integer> damageChart;
	private GameMap gameMap;
	
	// Methods: move(MovementRange, destination, location, movementChart), attack(locationself, locationtarget, AttackRange, damageChart), die(), 
	// receiveDamage(health, damageopponent), getpath(location, destination)
	
	public int getpath (int xdestination, int ydestination) { //This method calculates the movementcost of the path from the current location to the destination, return movementcost
        int xl = getX();
        int yl = getY();
        int xd = xdestination;
        int yd = ydestination;
        int x = xl; //x is the current x-coordinate
        int y = yl; //y is the current y-coordinate
        int movementcost = 0;
        
        //Browse through the x direction of the path and add the movementcosts of the terrain to the movementcost
        while (x != xd) {
            if (xl < xd) {
                x++;
            }
            if (xl > xd) {
                x--;
            }
            TerrainType terrainType = gameMap.getField(x, yl).getTerrainType();
            movementcost = movementcost + movementChart.get(terrainType);   
        }
        
        //Browse through the y direction of the path and add the movementcosts of the terrain to the movementcost
        while (y != yd) {
			if (yl < yd) {
				y++;
			}
			if (yl > yd) {
				y--;
			}
			TerrainType terrainType = gameMap.getField(xl, y).getTerrainType();
			movementcost = movementcost + movementChart.get(terrainType);
        }
        return movementcost;
    }
	
	public void move(int movementRange, int xdestination, int ydestination) { //This method moves the unit to the destination, reduce movementrange, set destination to occupied
        int xd = xdestination;
        int yd = ydestination;
		int movementcost = getpath(xdestination, ydestination);
		
		//Check if the destination is empty
		if (gameMap.getField(xd, yd).getIsOccupied() != true) {  
			System.out.println("Destination is occupied.");
            return;
		}
		
	    // Check if the destination is within the movement range 
	    if (movementcost > movementRange) {
	        System.out.println("Destination is out of range.");
	        return;
	    }

	    // Move the unit
	    setX(xd);
	    setY(yd);
	    
	    // Reduce the movement range
	    this.movementRange -= movementcost; 
	    
	    // Set the destination to occupied
	    gameMap.getField(xd, yd).setIsOccupied(true);
	}
	
	public void attack(int locationself, int locationtarget, int attackRange, Map<TerrainType, Integer> damageChart) {
		// Get target location 
		// Get self location
		// Check if the target is within the attack range
		// Get the opponent type of the target
		// Get the damage from the damage chart
		// Reduce the target's health
	}
	
	public void die() {
		// Remove the unit from the game
	}
	
	public void receiveDamage(int health, int damageopponent) {
		// Reduce the unit's health
		// Check if the unit is dead
		// if dead, call die()
	}
	
	// Constructor
	
	public Units(int price, int health, int damage, int attackRange, int movementRange, int x, int y, String type,
			Map<TerrainType, Integer> movementChart, Map<OpponentType, Integer> damageChart) {
		this.price = price;
		this.health = health;
		this.damage = damage;
		this.attackRange = attackRange;
		this.movementRange = movementRange;
		this.X = x;
		this.Y = y;
		this.type = type;
		this.movementChart = movementChart;
		this.damageChart = damageChart;
	}
	
	
	
	
	// Getters and Setters
	
	//Price
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//Health
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	//Damage
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	//AttackRange
	public int getAttackRange() {
		return attackRange;
	}
	
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
	//MovementRange
	public int getMovementRange() {
		return movementRange;
	}
	
	public void setMovementRange(int movementRange) {
		this.movementRange = movementRange;
	}
	
	//Location X and Y
	//X
	public int getX() {
		return X;
	}
	
	public void setX(int X) {
		this.X = X;
	}
	//Y
	public int getY() {
		return Y;
	}
	
	public void setY(int Y) {
		this.Y = Y;
	}
	//Type
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	//MovementChart
	public Map<TerrainType, Integer> getMovementChart() {
		return movementChart;
	}
	
	public void setMovementChart(Map<TerrainType, Integer> movementChart) {
		this.movementChart = movementChart;
	}
	
	//DamageChart
	public Map<OpponentType, Integer> getDamageChart() {
		return damageChart;
	}
	
	public void setDamageChart(Map<OpponentType, Integer> damageChart) {
		this.damageChart = damageChart;
	}
	

	

	
	
	
}
 