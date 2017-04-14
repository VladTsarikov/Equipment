package by.htp.equipment.launcher;

import java.util.Date;

import by.htp.equipment.entity.Accessory;
import by.htp.equipment.entity.Client;
import by.htp.equipment.entity.Data;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.Equipment.Season;
import by.htp.equipment.entity.Info;
import by.htp.equipment.entity.RentStation;
import by.htp.equipment.entity.RentUnit;
import by.htp.equipment.entity.accessory.Helmet;
import by.htp.equipment.entity.accessory.Protection;
import by.htp.equipment.entity.accessory.SkyPole;
import by.htp.equipment.entity.equipment.Bicycle;
import by.htp.equipment.entity.equipment.Roller;
import by.htp.equipment.entity.equipment.Skate;
import by.htp.equipment.entity.equipment.Skiing;
import by.htp.equipment.logic.ClientsOperation;
import by.htp.equipment.logic.Operation;

public class Main {

	public static void main(String[] args){
		
		Equipment bicycle = new Bicycle("Bicycle-LTD", 8, "Universal", "Mountain bike", "Aluminum");
		Equipment rollers = new Roller("Roller-Relmax",7,"Male",42,72);
		Equipment skate = new Skate("Skate-Tukzar",4,"Female",38);
		Equipment skiing = new Skiing("Skiing-Monster",9,"Universal",170);
		
		Equipment helmet = new Helmet("Helmet-Author", 2, "Universal",56,"Polycarbonate");
		Equipment protection = new Protection("Protection-Fora",4,"Universal","M");
		Equipment skyPoles = new SkyPole("SkyPole-Visu",3,"Universal",160);
		
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
		
		Client client1 = new Client("Петров","Иван",1,2.0,12.45);
		Operation.addClient(client1);
		
		ClientsOperation client1Op = new ClientsOperation(client1);
		client1Op.rentEquipment(skate);
		client1Op.rentEquipment(rollers);
		client1Op.rentEquipment(bicycle);
		client1Op.handOverEquipment(skate);
		client1Op.handOverEquipment(rollers);
		
		Data equipInfo = new Data();
	//	equipInfo.showFreeEquipment();
		//equipInfo.showRentEquipment();
		//Data test = new Data();
		equipInfo.writeFreeEquipment();
		equipInfo.writeRentEquipment();
		equipInfo.makeReport();
		
	}
}
