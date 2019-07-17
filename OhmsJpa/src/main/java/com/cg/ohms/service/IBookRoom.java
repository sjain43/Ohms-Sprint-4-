package com.cg.ohms.service;

import java.util.Map;

public interface IBookRoom {
	Object bookRoom(Object object, int roomtype, ListData listdata, int numberperson, BookingDetailsDTO bookingdetails,int diffdays)
			throws PersonExceedException, RoomAlreadyBookedException, NoRoomAvailable;

	Object cancelRoom(int id, Map<Integer, BookingDetailsDTO> cancelneedmap) throws CancelBookingException;
}
