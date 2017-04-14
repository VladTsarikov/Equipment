package by.htp.equipment.logic;

import by.htp.equipment.entity.Client;


public class Operation {

	public static void addClient(Client client){
		Client[] newClients = new Client[ClientsOperation.getClients().length+1];
		for(int k = 0; k < ClientsOperation.getClients().length;k++){
			newClients[k] = ClientsOperation.getClients()[k];
		}
		newClients[newClients.length-1] = client;
		ClientsOperation.setClients(newClients);
	}
	
	public static void deleteClient(Client client){
		int b=0;
		Client[] newClients = new Client[ClientsOperation.getClients().length-1];
		for(int i = 0; i < ClientsOperation.getClients().length;i++){
			if(ClientsOperation.getClients()[i].equals(client)){
				ClientsOperation.getClients()[i] = null;
			}
		}
		for(int j = 0; j < ClientsOperation.getClients().length;j++){
		if(ClientsOperation.getClients()[j] !=null){
			newClients[b] = ClientsOperation.getClients()[j];
			b++;
		}
		else
			continue;
		}
		ClientsOperation.setClients(newClients);
}
	
	
	
}
