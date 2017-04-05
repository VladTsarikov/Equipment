package by.htp.equipment.entity;


public class RentStation {

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
	
	public static int getLengthStatEquip(){
		return StationsEquipment.length;
	}

	
	public RentStation(Equipment[] stationsEquipment) {
		super();
		StationsEquipment = stationsEquipment;
		
	}
	
	
	
}
