package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Interfaces.BookAHotelPage;
import Interfaces.LoginPage;
import Interfaces.SearchHotel;
import Interfaces.SelectHotelPage;

public class generalActions {

	public void login (WebDriver driver, String userName, String passWord) {
		driver.findElement(By.xpath(LoginPage.text_username)).sendKeys(userName);
		driver.findElement(By.xpath(LoginPage.text_password)).sendKeys(passWord);
		driver.findElement(By.xpath(LoginPage.button_login)).click();
	}
	public void searchHotel (WebDriver driver, String location, String hotel, String roomType, String noOfRoom, 
			String dateIn, String dateOut, String adultPerRoom, String childPerRoom) {
		
		Select drpLocation = new Select(driver.findElement(By.xpath(SearchHotel.combobox_location)));
		drpLocation.selectByVisibleText(location);
		
		Select drpHotel = new Select(driver.findElement(By.xpath(SearchHotel.combobox_hotel)));
		drpHotel.selectByVisibleText(hotel);
		
		Select drpRoomType = new Select(driver.findElement(By.xpath(SearchHotel.combobox_roomType)));
		drpRoomType.selectByVisibleText(roomType);
		
		Select drpNoOfRoom = new Select(driver.findElement(By.xpath(SearchHotel.combobox_noOfRoom)));
		drpNoOfRoom.selectByVisibleText(noOfRoom);
		
		driver.findElement(By.xpath(SearchHotel.textbox_dateIn)).clear();
		driver.findElement(By.xpath(SearchHotel.textbox_dateIn)).sendKeys(dateIn);

		driver.findElement(By.xpath(SearchHotel.textbox_dateOut)).clear();
		driver.findElement(By.xpath(SearchHotel.textbox_dateOut)).sendKeys(dateOut);
		
		Select AdultPerRoom = new Select(driver.findElement(By.xpath(SearchHotel.combobox_adultPerRoom)));
		AdultPerRoom.selectByVisibleText(adultPerRoom);
		
		Select ChildPerRoom = new Select(driver.findElement(By.xpath(SearchHotel.combobox_childPerRoom)));
		ChildPerRoom.selectByVisibleText(childPerRoom);
		
		driver.findElement(By.xpath(SearchHotel.button_search)).click();
	}
	public void bookHotel (WebDriver driver, String firstName, String lastName, String billingAddress, String creditCardNo, 
			String creditCardType, String expiryMonth, String expiryYear, String CCVnum) {
		
		driver.findElement(By.xpath(BookAHotelPage.text_firstName)).clear();
		driver.findElement(By.xpath(BookAHotelPage.text_firstName)).sendKeys(firstName);
		
		driver.findElement(By.xpath(BookAHotelPage.text_lastName)).clear();
		driver.findElement(By.xpath(BookAHotelPage.text_lastName)).sendKeys(lastName);
		
		driver.findElement(By.xpath(BookAHotelPage.text_billingAddress)).clear();
		driver.findElement(By.xpath(BookAHotelPage.text_billingAddress)).sendKeys(billingAddress);

		driver.findElement(By.xpath(BookAHotelPage.text_creditCardNo)).clear();
		driver.findElement(By.xpath(BookAHotelPage.text_creditCardNo)).sendKeys(creditCardNo);
		
		Select drpCreditCardType = new Select(driver.findElement(By.xpath(BookAHotelPage.combobox_creditCardType)));
		drpCreditCardType.selectByVisibleText(creditCardType);
		
		Select drpExpiryMonth = new Select(driver.findElement(By.xpath(BookAHotelPage.combobox_expiryMonth)));
		drpExpiryMonth.selectByVisibleText(expiryMonth);
		
		Select drpExpiryYear = new Select(driver.findElement(By.xpath(BookAHotelPage.combobox_expiryYear)));
		drpExpiryYear.selectByVisibleText(expiryYear);

		driver.findElement(By.xpath(BookAHotelPage.text_CCVnum)).clear();
		driver.findElement(By.xpath(BookAHotelPage.text_CCVnum)).sendKeys(CCVnum);
		
		driver.findElement(By.xpath(BookAHotelPage.button_book)).click();

		}
	public void selectHotel(WebDriver driver){
		driver.findElement(By.xpath(SelectHotelPage.radioButton_0)).click();
		driver.findElement(By.xpath(SelectHotelPage.button_continue)).click();
	}
	
}
