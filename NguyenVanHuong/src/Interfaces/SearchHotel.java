package Interfaces;

public interface SearchHotel {

	String combobox_location = "//*[@id='location']";
	String combobox_hotel = "//*[@id='hotels']";
	String combobox_roomType = "//*[@id=\"room_type\"]";
	String combobox_noOfRoom = "//*[@id=\"room_nos\"]";
	String textbox_dateIn = "//*[@id=\"datepick_in\"]";
	String textbox_dateOut = "//*[@id=\"datepick_out\"]";
	String combobox_adultPerRoom = "//*[@id=\"adult_room\"]";
	String combobox_childPerRoom = "//*[@id=\"child_room\"]";
	String button_search = "//*[@id=\"Submit\"]";
	String button_reset = "//*[@id=\"Reset\"]";
	
}
