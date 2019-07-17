package com.cg.ohms.service.impl;

import java.util.Map;

import com.cg.ohms.dto.ACRoomDetailsDTO;
import com.cg.ohms.dto.BookingDetailsDTO;
import com.cg.ohms.dto.KingRoomDetailsDTO;
import com.cg.ohms.dto.NonACRoomDetailsDTO;
import com.cg.ohms.dto.QueenRoomDetailsDTO;
import com.cg.ohms.exception.CancelBookingException;
import com.cg.ohms.exception.NoRoomAvailable;
import com.cg.ohms.exception.PersonExceedException;
import com.cg.ohms.exception.RoomAlreadyBookedException;
import com.cg.ohms.service.IBookRoom;
import com.cg.ohms.staticdb.ListData;

public class BookRoomImpl implements IBookRoom {
	Object bookRoom(Object object, int roomtype, ListData listdata, int numberperson, BookingDetailsDTO bookingdetails,int diffdays) throws PersonExceedException, RoomAlreadyBookedException, NoRoomAvailable; {
	 
	
	}
	Object cancelRoom(int id, Map<Integer, BookingDetailsDTO> cancelneedmap) throws CancelBookingException {
		
	}

}
