package by.htp.equipment.entity;

public class Rollers extends Equipment {

	private int id;

	public Rollers(String title, double price, String category, int id) {
		super(title, price, category);
		this.id = id;
	}
	
}
