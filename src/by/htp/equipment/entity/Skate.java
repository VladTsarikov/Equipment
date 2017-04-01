package by.htp.equipment.entity;

public class Skate extends Equipment {

	private int id;

	public Skate(String title, double price, String category, int id) {
		super(title, price, category);
		this.id = id;
	}
	
}
