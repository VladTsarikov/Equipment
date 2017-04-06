package by.htp.equipment.entity.accessory;

import by.htp.equipment.entity.Accessory;

public class Helmet extends Accessory {

	private int size;
	private String material;

	public Helmet(String title, double price, String gender, int size, String material) {
		super(title, price, gender);
		this.size = size;
		this.material = material;
	}
	
}
