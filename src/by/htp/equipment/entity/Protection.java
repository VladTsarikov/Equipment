package by.htp.equipment.entity;

public class Protection extends Accessory {

	private int id;

	public Protection(String title, double price, String category, int id) {
		super(title, price, category);
		this.id = id;
	}
	
}
