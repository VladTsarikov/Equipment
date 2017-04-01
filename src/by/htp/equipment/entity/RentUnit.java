package by.htp.equipment.entity;

public class RentUnit extends Equipment{

	private Equipment[] UnitsEquipment;
	private Equipment[] UnitsAccessory;
	
	public RentUnit(Equipment[] unitsEquipment, Equipment[] unitsAccessory) {
		//super();
		UnitsEquipment = unitsEquipment;
		UnitsAccessory = unitsAccessory;
	}
	
	
	
}
