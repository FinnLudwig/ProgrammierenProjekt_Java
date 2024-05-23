package units;
import java.util.Map;
import java.util.HashMap;

public abstract class Units {
	// Attributes: Price, Health, Damage, AttackRange, MovementRange, Location, Type, MovementChart, AttackChart
	private int price;
	private int health;
	private int damage;
	private int attackRange;
	private int movementRange;
	private int location;
	private String type;
	private Map<TerrainType, Integer> movementChart;
	private Map<OpponentType, Integer> damageChart;
	
	// Methods: move(MovementRange, destination, location, movementChart), attack(locationself, locationtarget, AttackRange, damageChart), die(), 
	// receiveDamage(health, damageopponent) 
	
	public void move(int movementRange, int destination, int location, Map<TerrainType, Integer> movementChart) {
	    // Get destination 
		// Get location 
		// Check if the destination is within the movement range
		// Get the terrain type of the way to the destination
		// Get the movement cost from the movement chart
		// Check if the unit has enough movement points
		// Move the unit
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
	
	public Units(int price, int health, int damage, int attackRange, int movementRange, int location, String type,
			Map<TerrainType, Integer> movementChart, Map<OpponentType, Integer> damageChart) {
		this.price = price;
		this.health = health;
		this.damage = damage;
		this.attackRange = attackRange;
		this.movementRange = movementRange;
		this.location = location;
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
	
	//Location
	public int getLocation() {
		return location;
	}
	
	public void setLocation(int location) {
		this.location = location;
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
 