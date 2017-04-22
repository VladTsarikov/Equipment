package by.htp.equipment.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.equipment.logic.ClientsOperation;


public class Data implements Info {

	public void showFreeEquipment(){
		System.out.println("Free equipment: ");
		for(int i =0; i < RentStation.getLengthStatEquip();i++){
			System.out.println(RentStation.getStationsEquipment(i).toString());
		}
	}
	
	public void showRentEquipment(){
	System.out.println("Rented equipment: ");
		for(int i =0; i <RentUnit.getUnitsEquipment().length;i++){
			System.out.println(RentUnit.getUnitsEquipment()[i].toString());
		}
	}
	
	public void writeFreeEquipment(){
		File file = new File("FreeEquipment.txt");
		
		try {
			FileWriter bw = new FileWriter(file);
			for(int i =0; i < RentStation.getLengthStatEquip();i++){
				bw.write(RentStation.getStationsEquipment(i).toString()+"\n");
			}bw.close();
		} catch (IOException e) {
			System.out.println("File not found ");
		}
	}
	
	public void writeRentEquipment(){
		File file = new File("RentEquipment.txt");
		try {
			FileWriter bw = new FileWriter(file);
			for(int i =0; i <RentUnit.getUnitsEquipment().length;i++){
				bw.write(RentUnit.getUnitsEquipment()[i].toString()+"\n");
			}bw.close();
		} catch (IOException e) {
			System.out.println("File not found ");
		}
}
	
	public void makeReport(){
		
		Date dateNow = new Date();
	      SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd");
		String path = "rent_equipment_report_"+formatForDateNow.format(dateNow)+".txt";
		
		File file = new File(path);
		
		try {
			FileWriter bw = new FileWriter(file);
			for(int i =0; i <ClientsOperation.getClients().length;i++){
				bw.write(ClientsOperation.getClients()[i].toString()+"\n");
				//bw.write();
				bw.write("_ _ _ _ _ _ _ _ _");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("File not found ");
		}
	}
	
}
