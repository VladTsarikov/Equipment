package by.htp.equipment.entity;


public class Equipment {

	private String title;
	private double price;
	private String category;
	
private static Equipment allEquipment[];
//private static Equipment additionalEquipments[];

	public static Equipment[] getAllEquipment() {
	return allEquipment;
}

public static void setAllEquipment(Equipment[] allEquipment) {
	Equipment.allEquipment = allEquipment;
}

public static int getLenthOfAllEquipment(){
	return allEquipment.length;
}

	public Equipment(String title, double price, String category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}

	public Equipment() {
		
	}
	
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

	@Override
	public String toString() {
		return "Equipment [title=" + title + ", price=" + price + ", category="
				+ category + "]";
	}

	
	
	
}
