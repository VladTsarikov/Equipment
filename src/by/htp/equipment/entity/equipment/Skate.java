package by.htp.equipment.entity.equipment;

import by.htp.equipment.entity.Equipment;

public class Skate extends Equipment {

	private int size;
	
	public Skate(String title, double price, String gender, int size) {
		super(title, price,gender );
		this.size = size;
	}
	
}
