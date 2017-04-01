package by.htp.equipment.entity;

public class SkyPoles extends Accessory {
 
	private int id;

	public SkyPoles(String title, double price, String category, int id) {
		super(title, price, category);
		this.id = id;
	}
	
}
