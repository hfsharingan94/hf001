package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Actions.generalActions;

public class TC001_Verify_that_user_could_book_a_hotel_with_all_valid_data extends generalActions {
	String baseUrl = "http://www.adactin.com/HotelApp/";
  @Test
  public void a() {
	  System.setProperty("webdriver.chrome.driver","C:\\seleniumChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\KimAnh\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");
		WebDriver driver = new ChromeDriver(options);
				
		driver.get(baseUrl);
		
		login(driver,"hfsharingan94","firenfreeze0112");
		
		searchHotel(driver, "Melbourne", "Hotel Sunshine", "Double", "2 - Two", "27/07/2017", "28/07/2017", "2 - Two", "1 - One" );
		
		selectHotel(driver);
		
		bookHotel (driver, "Huong", "Nguyen Van", "To 8, Hoa Tho Tay, Cam Le, Da Nang, Viet Nam", "1234567890123456", 
				"American Express", "February", "2022", "12345");
		
		driver.manage().timeouts().implicitlyWait(100, null);
		
		String expect = "Booking Confirmation";
		String actual = driver.findElement(By.xpath("//*[@id=\"booking_form\"]/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(actual, expect);
		
		driver.close();
  }
}