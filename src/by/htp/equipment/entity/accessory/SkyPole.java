package by.htp.equipment.entity.accessory;

import by.htp.equipment.entity.Accessory;

public class SkyPole extends Accessory {
 
	private int length;

	public SkyPole(String title, double price, String gender, int length) {
		super(title, price, gender);
		this.length = length;
	}
	
}
