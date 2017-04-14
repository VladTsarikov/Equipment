package by.htp.equipment.logic;

import by.htp.equipment.entity.Client;
import by.htp.equipment.entity.Equipment;
import by.htp.equipment.entity.RentStation;
import by.htp.equipment.entity.RentUnit;

public class ClientsOperation{

	private Client client;
	
	private static Client[] clients = new Client[0];
	
	public ClientsOperation(Client client) {
		super();
		this.client = client;
	}
	
	public ClientsOperation() {		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public static Client[] getClients() {
		return clients;
	}

	public static void setClients(Client[] clients) {
		ClientsOperation.clients = clients;
	}

	public void rentEquipment(Equipment equip){
		int b = 0;
		if( getClient().getCountRent()<3){
		int a = getClient().getCountRent()+1;
		Equipment[] newUnitsEquipment = new Equipment[RentUnit.getUnitsEquipment().length+1];
		Equipment[] newStationEquipment = new Equipment[RentStation.getStationsEquipment().length-1];
		for(int k = 0; k < RentUnit.getUnitsEquipment().length;k++){
			newUnitsEquipment[k] = RentUnit.getUnitsEquipment()[k];
		}
		newUnitsEquipment[newUnitsEquipment.length-1] = equip;
		RentUnit.setUnitsEquipment(newUnitsEquipment);
		for(int i = 0; i < RentStation.getStationsEquipment().length;i++){
			if(RentStation.getStationsEquipment()[i].equals(equip)){
				RentStation.getStationsEquipment()[i] = null;
			}
		}
		for(int j = 0; j < RentStation.getStationsEquipment().length;j++){
		if(RentStation.getStationsEquipment()[j] !=null){
			newStationEquipment[b] = RentStation.getStationsEquipment()[j];
			b++;
		}
		else
			continue;
		}
		RentStation.setStationsEquipment(newStationEquipment);
		getClient().setCountRent(a);
		}
		else{
			System.out.println("Клиент израсходовал лимит товаров! ");
		}
		
		
	}
	
	public void handOverEquipment(Equipment equip){
		int c = 0;
		int h = getClient().getCountRent()-1;
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
		for(int j = 0; j < RentUnit.getUnitsEquipment().length;j++){
			if(RentUnit.getUnitsEquipment()[j] !=null){
				newUnitsEquipment[c] = RentUnit.getUnitsEquipment()[j];
				c++;
			}
		}
		RentUnit.setUnitsEquipment(newUnitsEquipment);
		getClient().setCountRent(h);
	}
	
	/*public void reset(){
		for(int j = 0; j<Equipment.getLenthOfAllEquipment();j++){
			RentStation.setStationsEquipment(Equipment.getAllEquipment());
		}
	}*/
	/*public void findSuitableEquipment(Bicycle obj, int size){
		for(int i = 0; i<RentStation.getStationsEquipment().length;i++){
			if(obj.){
				
			}
		}
	}*/
}
