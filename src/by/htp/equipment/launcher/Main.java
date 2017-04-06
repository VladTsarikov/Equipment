package by.htp.equipment.launcher;

import by.htp.equipment.entity.Accessory;
import by.htp.equipment.entity.Client;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.Equipment.Season;
import by.htp.equipment.entity.RentStation;
import by.htp.equipment.entity.RentUnit;
import by.htp.equipment.entity.accessory.Helmet;
import by.htp.equipment.entity.accessory.Protection;
import by.htp.equipment.entity.accessory.SkyPoles;
import by.htp.equipment.entity.equipment.Bicycle;
import by.htp.equipment.entity.equipment.Rollers;
import by.htp.equipment.entity.equipment.Skate;
import by.htp.equipment.entity.equipment.Skiing;
import by.htp.equipment.logic.Operations;

public class Main {

	public static void main(String[] args){
		
		Equipment bicycle = new Bicycle("LTD", 8, "Universal", "Mountain bike", "Aluminum");
		Equipment rollers = new Rollers("Relmax",7,"Male",42,72);
		Equipment skate = new Skate("Tukzar",4,"Female",38);
		Equipment skiing = new Skiing("Monster",9,"Universal",170);
		
		Equipment helmet = new Helmet("Author", 2, "Universal",56,"Polycarbonate");
		Equipment protection = new Protection("Fora",4,"Universal","M");
		Equipment skyPoles = new SkyPoles("Visu",3,"Universal",160);
		
		Equipment[] unitsEquipment = new Equipment[0];
		Equipment[] stationEquipment = new Equipment[7];
		
		RentStation.setStationsEquipment(stationEquipment);
		RentUnit.setUnitsEquipment(unitsEquipment);
		
		stationEquipment[0] = bicycle;
		stationEquipment[1] = rollers;
		stationEquipment[2] = skate;
		stationEquipment[3] = skiing;
		stationEquipment[4] = helmet;
		stationEquipment[5] = protection;
		stationEquipment[6] = skyPoles;
		
		Client client1 = new Client("Петров","Иван",1,2,12.45);
		
		Operations client1Op = new Operations(client1);
		client1Op.rentEquipment(skate);
		client1Op.rentEquipment(rollers);
		client1Op.rentEquipment(bicycle);
		client1Op.handOverEquipment(skate);
		client1Op.handOverEquipment(rollers);
		client1Op.showFreeEquipment();
		client1Op.showUnitEquipment();
	}
}
