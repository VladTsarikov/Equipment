package by.htp.equipment.entity;


public class Equipment {

	private String title;
	private double price;
	private int size;
	
private static Equipment equipments[];
	
	public Equipment(String title, double price, int size) {
		this.title = title;
		this.price = price;
		this.size = size;
	}

	public Equipment(Equipment equipments[]) {
		this.equipments=equipments;
		}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double weight) {
		this.price = weight;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
