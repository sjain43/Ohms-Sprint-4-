package com.cg.ohms.dto;

public class KingRoomDetailsDTO {
	private int numberofkingrooms;
	private boolean status;
	private double price;
	private int numberofperson;

	public KingRoomDetailsDTO() {

	}

	public KingRoomDetailsDTO(int numberofkingrooms, Boolean status, double price, int numberofperson) {
		super();
		this.numberofkingrooms = numberofkingrooms;
		this.status = status;
		this.price = price;
		this.numberofperson = numberofperson;
	}

	public int getNumberofkingrooms() {
		return numberofkingrooms;
	}

	public void setNumberofkingrooms(int numberofkingrooms) {
		this.numberofkingrooms = numberofkingrooms;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberofperson() {
		return numberofperson;
	}

	public void setNumberofperson(int numberofperson) {
		this.numberofperson = numberofperson;
	}

}
