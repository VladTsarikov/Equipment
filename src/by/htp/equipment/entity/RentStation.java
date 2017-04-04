package by.htp.equipment.entity;


public class RentStation extends Equipment{

	private static Equipment[] StationsEquipment;
	
	
	public static Equipment[] getStationsEquipment() {
		return StationsEquipment;
	}
	

	public static void setStationsEquipment(Equipment[] stationsEquipment) {
		StationsEquipment = stationsEquipment;
	}

	public static Equipment getStationsEquipment(int a) {
		return StationsEquipment[a];
	}
	
	public static int getLenthStatEquip(){
		return StationsEquipment.length;
	}

	
	public RentStation(Equipment[] stationsEquipment) {
		super();
		StationsEquipment = stationsEquipment;
		
	}
	
}
