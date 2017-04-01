package by.htp.equipment.launcher;

import by.htp.equipment.entity.Accessory;
import by.htp.equipment.entity.Bicycle;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.Helmet;
import by.htp.equipment.entity.Protection;
import by.htp.equipment.entity.Rollers;
import by.htp.equipment.entity.Skate;
import by.htp.equipment.entity.Skiing;
import by.htp.equipment.entity.SkyPoles;

public class Main {

	public static void main(String[] args){
		
		Equipment bicycle = new Bicycle("Bicycle1",4,"",1);
		Equipment rollers = new Rollers("Bicycle1",4,"",1);
		Equipment skate = new Skate("Bicycle1",4,"",1);
		Equipment skiing = new Skiing("Bicycle1",4,"",1);
		
		Equipment helmet = new Helmet("Bicycle1",4,"",1);
		Equipment protection = new Protection("Bicycle1",4,"",1);
		Equipment skyPoles = new SkyPoles("Bicycle1",4,"",1);
		
		
		Equipment[] unitsEquipment = new Equipment[4];
		Equipment[] stationsEquipment = new Equipment[4];
		Equipment[] unitsAccessory = new Equipment[4];
		Equipment[] stationsAccessory = new Equipment[4];
		
		unitsEquipment[0] = new Equipment();
		unitsEquipment[1] = new Equipment();
		unitsEquipment[2] = new Equipment();
		unitsEquipment[3] = new Equipment();
		
		stationsEquipment[0] = new Equipment();
		stationsEquipment[1] = new Equipment();
		stationsEquipment[2] = new Equipment();
		stationsEquipment[3] = new Equipment();
		
		unitsAccessory[0] = new Accessory();
		unitsAccessory[1] = new Accessory("",2,"");
		unitsAccessory[2] = new Accessory("",2,"");
		unitsAccessory[3] = new Accessory("",2,"");
		
		stationsAccessory[0] = new Accessory("",2,"");
		stationsAccessory[1] = new Accessory("",2,"");
		stationsAccessory[2] = new Accessory("",2,"");
		stationsAccessory[3] = new Accessory("",2,"");
		
		
		
		
		
		
		/*Equipment equipments[] = new Equipment[4];
		
		equipments[0] = new Equipment("Skates",4,"Winter");
		equipments[1] = new Equipment("Skiing",8,"Winter");
		equipments[2] = new Equipment("Snowboard",9,"Winter");
		equipments[3] = new Equipment("Bicycle",6,"Summer");*/
		
	}
}
