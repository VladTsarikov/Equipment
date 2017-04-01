package by.htp.equipment.entity;

public class RentStation extends Equipment{

	private Equipment[] StationsEquipment;
	private Equipment[] StationsAccessory;
	
	public RentStation(Equipment[] stationsEquipment,
			Equipment[] stationsAccessory) {
		super();
		StationsEquipment = stationsEquipment;
		StationsAccessory = stationsAccessory;
	}
	
	
	
}
