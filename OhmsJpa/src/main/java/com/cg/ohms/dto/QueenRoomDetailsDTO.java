package com.cg.ohms.dto;

public class QueenRoomDetailsDTO {
	int numberofqueenrooms;
	boolean status;
	double price;
	int numberofperson;

	public QueenRoomDetailsDTO(int numberofqueenrooms, Boolean status, double price, int numberofperson) {
		super();
		this.numberofqueenrooms = numberofqueenrooms;
		this.status = status;
		this.price = price;
		this.numberofperson = numberofperson;
	}

	public int getNumberofqueenrooms() {
		return numberofqueenrooms;
	}

	public void setNumberofqueenrooms(int numberofqueenrooms) {
		this.numberofqueenrooms = numberofqueenrooms;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setNumberofperson(int numberofperson) {
		this.numberofperson = numberofperson;
	}

	public boolean getStatus() {
		return status;
	}

	public double getPrice() {
		return price;
	}

	public int getNumberofperson() {
		return numberofperson;
	}

}
