package by.htp.equipment.entity;

import by.htp.equipment.logic.Operations;

public class Client extends Operations {

	private String firstName;
	private String lastName;
	private int id;
	private double useTime;
	private double rentTime;
	
	public Client(String firstName, String lastName, int id, double useTime,
			double rentTime) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.useTime = useTime;
		this.rentTime = rentTime;
	}
	
	
	
}
