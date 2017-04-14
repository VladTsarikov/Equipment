package by.htp.equipment.entity;

import by.htp.equipment.logic.ClientsOperation;

public class Client {

	private String firstName;
	private String lastName;
	private int id;
	private double useTime;
	private double rentTime;
	private int countRent;
	
	
	public Client(String firstName, String lastName, int id, double useTime,double rentTime) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.useTime = useTime;
		this.rentTime = rentTime;
	}

	public int getCountRent() {
		return countRent;
	}

	public void setCountRent(int countRent) {
		this.countRent = countRent;
	}

	@Override
	public String toString() {
		return firstName + ", " + lastName
				+ ", id=" + id + ", useTime=" + useTime + ", rentTime="
				+ rentTime + ", countRent=" + countRent;
	}
	
	
	
}
