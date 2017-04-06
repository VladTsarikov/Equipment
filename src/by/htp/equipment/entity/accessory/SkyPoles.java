package by.htp.equipment.entity.accessory;

import by.htp.equipment.entity.Accessory;

public class SkyPoles extends Accessory {
 
	private int length;

	public SkyPoles(String title, double price, String gender, int length) {
		super(title, price, gender);
		this.length = length;
	}
	
}
