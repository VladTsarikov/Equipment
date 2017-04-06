package by.htp.equipment.entity.accessory;

import by.htp.equipment.entity.Accessory;

public class Protection extends Accessory {

	private String size;

	public Protection(String title, double price, String gender, String size) {
		super(title, price, gender);
		this.size = size;
	}
	
}
