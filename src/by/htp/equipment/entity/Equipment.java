package by.htp.equipment.entity;


public class Equipment {

	private String title;
	private double price;
	private String category;
	
//private static Equipment mainEquipments[];
//private static Equipment additionalEquipments[];

	
	
	public Equipment(String title, double price, String category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}

	public Equipment() {
		
	}
	
	
	
	/*public Equipment(Equipment mainEquipments[]) {
		this.mainEquipments=mainEquipments;
		}*/
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double weight) {
		this.price = weight;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
