package by.htp.equipment.entity;

public class Helmet extends Accessory {

	private int id;

	public Helmet(String title, double price, String category, int id) {
		super(title, price, category);
		this.id = id;
	}
	
}
