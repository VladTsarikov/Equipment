package by.htp.equipment.entity.equipment;

import by.htp.equipment.entity.Equipment;

public class Bicycle extends Equipment{

    private String type;
    private String kindOfFrame;
    
	public Bicycle(String title, double price, String gender, String type,String kindOfFrame ) {
		super(title, price, gender);
		this.type = type;
		this.kindOfFrame = kindOfFrame;
	}
	
	
	
}
