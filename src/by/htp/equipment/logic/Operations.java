package by.htp.equipment.logic;

import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.RentStation;
import by.htp.equipment.entity.RentUnit;

public class Operations{

	public static void showFreeEquipment(){
		
		for(int i =0; i < RentStation.getLengthStatEquip();i++){
			if(RentStation.getStationsEquipment()[i] == null){
				continue;
			}
			System.out.println(RentStation.getStationsEquipment(i).toString());
		}
	}
	
	public static void rentEquipment(Equipment equip){
		//int c = 0;
		int b = 0;
		Equipment[] newUnitsEquipment = new Equipment[RentUnit.getUnitsEquipment().length];
		Equipment[] newStationEquipment = new Equipment[RentStation.getStationsEquipment().length-1];
		newUnitsEquipment[RentUnit.getUnitsEquipment().length-1] = equip;
		RentUnit.setUnitsEquipment(newUnitsEquipment);
		for(int i = 0; i < RentStation.getStationsEquipment().length;i++){
			if(RentStation.getStationsEquipment()[i].equals(equip)){
				RentStation.getStationsEquipment()[i] = null;
			}
			}
		for(int j = 0; j < RentStation.getStationsEquipment().length;j++){
		if(RentStation.getStationsEquipment()[j] !=null){
			newStationEquipment[b] = RentStation.getStationsEquipment()[j];//!
			b++;
		}
		else
			continue;
		}
		RentStation.setStationsEquipment(newStationEquipment);
	}
	
	public static void handOverEquipment(Equipment equip){
		int c = 0;
		Equipment[] newStationEquipment = new Equipment[RentStation.getStationsEquipment().length+1];
		Equipment[] newUnitsEquipment = new Equipment[RentUnit.getUnitsEquipment().length-1];
		for(int j = 0; j < RentStation.getStationsEquipment().length;j++){
			newStationEquipment[j] = RentStation.getStationsEquipment()[j];
		}
		newStationEquipment[RentStation.getStationsEquipment().length] = equip;
		RentStation.setStationsEquipment(newStationEquipment);
		
		for(int i = 0; i < RentUnit.getUnitsEquipment().length;i++){
			if(RentUnit.getUnitsEquipment()[i].equals(equip)){
				RentUnit.getUnitsEquipment()[i] = null;
			}
		}
		/*for(int j = 0; j < RentUnit.getUnitsEquipment().length;j++){
			if(RentUnit.getUnitsEquipment()[j] !=null){//!
				newUnitsEquipment[c] = RentUnit.getUnitsEquipment()[j];
				c++;
			}
			}
		//RentUnit.setUnitsEquipment(newUnitsEquipment);*/
	}
	
	
	
	/*public void reset(){
		for(int j = 0; j<Equipment.getLenthOfAllEquipment();j++){
			RentStation.setStationsEquipment(Equipment.getAllEquipment());
		}
	}*/
	
}
