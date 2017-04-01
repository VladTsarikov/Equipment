package by.htp.equipment.entity;

public class Skiing extends Equipment {

	private int id;

	public Skiing(String title, double price, String category, int id) {
		super(title, price, category);
		this.id = id;
	}
	
}
