package players;

import java.util.ArrayList;

import units.Units;

public class Player {
	private String name;
	private int money;
	private ArrayList<Units> units;
	private int numberOfUnits;
	

	//addUnit and removeUnit
	public void addUnit(Units unit) {
		units.add(unit);
		numberOfUnits++;
	}
	
	public void removeUnit(Units unit) {
		units.remove(unit);
		numberOfUnits--;
	}
	
	//buyUnit
	public void buyUnit(Units unit) {
		if (money >= unit.getPrice()) {
			money -= unit.getPrice();
			addUnit(unit);
		}
	}
	
	//Konstruktor
	public Player(String name) {
		this.name = name;
		this.money = 4000;
		this.units = new ArrayList<Units>();
		numberOfUnits = 0;
	}
	
	//Getter and Setter
	
	//getName
	public String getName() {
		return name;
	}
	
	//setName
	public void setName(String name) {
		this.name = name;
	}
	
	//getMoney
	public int getMoney() {
		return money;
	}
	
	//setMoney
	public void setMoney(int money) {
		this.money = money;
	}
	
	//getUnits
	public ArrayList<Units> getUnits() {
		return units;
	}
	
	//get numberOfUnits
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	
	//set numberOfUnits
	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

}
