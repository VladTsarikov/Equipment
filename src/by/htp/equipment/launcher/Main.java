package by.htp.equipment.launcher;

import by.htp.equipment.entity.Accessory;
import by.htp.equipment.entity.Bicycle;
import by.htp.equipment.entity.Client;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.Helmet;
import by.htp.equipment.entity.Protection;
import by.htp.equipment.entity.RentStation;
import by.htp.equipment.entity.RentUnit;
import by.htp.equipment.entity.Rollers;
import by.htp.equipment.entity.Skate;
import by.htp.equipment.entity.Skiing;
import by.htp.equipment.entity.SkyPoles;
import by.htp.equipment.logic.Operations;

public class Main {

	public static void main(String[] args){
		
		Equipment bicycle = new Bicycle("Bicycle1",8,"Summer",1);
		Equipment rollers = new Rollers("Rollers1",7,"Summer",2);
		Equipment skate = new Skate("Skate1",4,"Winter",3);
		Equipment skiing = new Skiing("Skiing1",9,"Winter",4);
		
		Equipment helmet = new Helmet("Helmet1",2,"Summer",5);
		Equipment protection = new Protection("Protection1",4,"Summer",6);
		Equipment skyPoles = new SkyPoles("SkyRollers1",3,"Winter",7);
		
		Equipment[] unitsEquipment = new Equipment[1];
		Equipment[] stationEquipment = new Equipment[7];
		
		RentStation.setStationsEquipment(stationEquipment);
		RentUnit.setUnitsEquipment(unitsEquipment);
		
		//Equipment[] allEquipment = new Equipment[7];
		stationEquipment[0] = bicycle;
		stationEquipment[1] = rollers;
		stationEquipment[2] = skate;
		stationEquipment[3] = skiing;
		stationEquipment[4] = helmet;
		stationEquipment[5] = protection;
		stationEquipment[6] = skyPoles;
		
		
		Client client1 = new Client("Петров","Иван",1,2,12.45);
		
		//client1.rentEquipment(2);
		//client1.rentEquipment(4);
		//client1.rentEquipment(1);
		//Operations.showFreeEquipment();
		Operations.rentEquipment(skate);
		Operations.rentEquipment(rollers);
		Operations.rentEquipment(bicycle);
		Operations.handOverEquipment(skate);
		Operations.handOverEquipment(rollers);
		Operations.showFreeEquipment();
	}
}
