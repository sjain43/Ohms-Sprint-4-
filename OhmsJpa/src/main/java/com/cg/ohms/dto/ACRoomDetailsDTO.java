package com.cg.ohms.dto;

public class ACRoomDetailsDTO {
	private int numberofacrooms;
	private boolean status;
	private double price;
	private int numberofperson;

	public ACRoomDetailsDTO(int numberofacrooms, Boolean status, double price, int numberofperson) {
		super();
		this.numberofacrooms = numberofacrooms;
		this.status = status;
		this.price = price;
		this.numberofperson = numberofperson;
	}

	public int getNumberofacrooms() {
		return numberofacrooms;
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

	public void setNumberofacrooms(int numberofacrooms) {
		this.numberofacrooms = numberofacrooms;
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

}
