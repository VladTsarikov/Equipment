package by.htp.equipment.entity;


public abstract class Equipment {

	private String title;
	private double price;
	private String category;
	
//private static Equipment allEquipment[];




/*public static int getLenthOfAllEquipment(){
	return allEquipment.length;
}*/

	public Equipment(String title, double price, String category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
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
