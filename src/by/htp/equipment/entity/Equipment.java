package by.htp.equipment.entity;


public class Equipment {

	private String title;
	private double weight;
	private int size;
	
private static Equipment equipments[];
	
	public Equipment(String title, double weight, int size) {
		this.title = title;
		this.weight = weight;
		this.size = size;
	}

	public Equipment(Equipment equipments[]) {
		this.equipments=equipments;
		}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
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
