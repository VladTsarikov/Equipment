package by.htp.equipment.logic;

import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.RentStation;
import by.htp.equipment.entity.RentUnit;

public class Operations extends Equipment{

	public static void showFreeEquipment(){
		
		for(int i =0; i < RentStation.getLenthStatEquip();i++){
			if(RentStation.getStationsEquipment()[i] == null){
				continue;
			}
			System.out.println(RentStation.getStationsEquipment(i).toString());
		}
	}
	
	public int rentEquipment(int b){
		int c=0;
		reset();
		RentUnit.getUnitsEquipment()[c] = RentStation.getStationsEquipment()[b];
		c = RentUnit.getUnitsEquipment().length+1;
		c++;
		RentStation.getStationsEquipment()[b] = null;
		return c;
		
	}
	
	
	public void reset(){
		for(int j = 0; j<Equipment.getLenthOfAllEquipment();j++){
			RentStation.setStationsEquipment(Equipment.getAllEquipment());
		}
	}
	
}
