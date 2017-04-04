package by.htp.equipment.entity;

public class RentUnit extends Equipment{

	private static Equipment[] UnitsEquipment;
	
	public static Equipment[] getUnitsEquipment() {
		return UnitsEquipment;
	}

	public static void setUnitsEquipment(Equipment[] unitsEquipment) {
		UnitsEquipment = unitsEquipment;
	}
	public static Equipment getUnits(int a) {
		return UnitsEquipment[a];
	}
	
	public RentUnit(Equipment[] unitsEquipment) {
		UnitsEquipment = unitsEquipment;
		
	}
	
	public static int getLengthOfUnitEquipment(){
		return UnitsEquipment.length;
	}
	
	/*public static void setLengthOfUnitEquipment(int a){
		UnitsEquipment.length = a;
	}*/
	
}
