package com.cg.ohms.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingDetailsDTO {
	
	@Override
	public String toString() {
		return "Bookingid= " + bookingid + "\ncheck in date=" + new SimpleDateFormat("dd-MM-yyyy").format(checkinbook) + "\ncheck out book="
				+ new SimpleDateFormat("dd-MM-yyyy").format(checkoutbook) + "\nprice=" + price;
	}

	private int bookingid;
	private Date checkinbook;
	private Date checkoutbook;
	private double price;

	public int getBooingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public Date getCheckinbook() {
		return checkinbook;
	}

	public void setCheckinbook(Date checkinbook) {
		this.checkinbook = checkinbook;
	}

	public Date getCheckoutbook() {
		return checkoutbook;
	}

	public void setCheckoutbook(Date checkoutbook) {
		this.checkoutbook = checkoutbook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
