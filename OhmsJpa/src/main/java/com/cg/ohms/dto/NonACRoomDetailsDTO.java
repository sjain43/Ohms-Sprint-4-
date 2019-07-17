package com.cg.ohms.dto;

public class NonACRoomDetailsDTO {
	private int numberofnonacrooms;
	private boolean status;
	private double price;
	private int numberofperson;

	public NonACRoomDetailsDTO(int numberofnonacrooms, Boolean status, double price, int numberofperson) {
		super();
		this.numberofnonacrooms = numberofnonacrooms;
		this.status = status;
		this.price = price;
		this.numberofperson = numberofperson;
	}

	public int getNumberofnonacrooms() {
		return numberofnonacrooms;
	}

	public boolean getStatus() {
		return status;
	}

	public void setNumberofnonacrooms(int numberofnonacrooms) {
		this.numberofnonacrooms = numberofnonacrooms;
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

	public double getPrice() {
		return price;
	}

	public int getNumberofperson() {
		return numberofperson;
	}

}
