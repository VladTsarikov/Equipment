package by.htp.equipment.entity;

public class Bicycle extends Equipment{

	private int id;

	public Bicycle(String title, double price, String category, int id) {
		super(title, price, category);
		this.id = id;
	}
	
	
	
}
