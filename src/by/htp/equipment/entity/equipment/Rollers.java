package by.htp.equipment.entity.equipment;

import by.htp.equipment.entity.Equipment;

public class Rollers extends Equipment {

	private int size;
	private int diameterOfWheels;
	
	public Rollers(String title, double price, String gender, int size, int diameterOfWheels) {
		super(title, price, gender);
		this.size = size;
		this.diameterOfWheels = diameterOfWheels;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
