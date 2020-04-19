package Interfaces;

public interface BookAHotelPage {
	
	String text_firstName = "//*[@id=\"first_name\"]";
	String text_lastName = "//*[@id=\"last_name\"]";
	String text_billingAddress = "//*[@id=\"address\"]";
	String text_creditCardNo = "//*[@id=\"cc_num\"]";
	String combobox_creditCardType = "//*[@id=\"cc_type\"]";
	String combobox_expiryMonth = "//*[@id=\"cc_exp_month\"]";
	String combobox_expiryYear = "//*[@id=\"cc_exp_year\"]";
	String text_CCVnum = "//*[@id=\"cc_cvv\"]";
	String button_book = "//*[@id=\"book_now\"]";
	String button_cancel = "//*[@id=\"cancel\"]";

}
