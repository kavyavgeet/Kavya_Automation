package solum.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1st_Project {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Invoking browser
		//Chrome - Chrome driver - Methods > Close, get
		//Firefox - Firefox driver - Methods > Close, get 
		//Safari - Safari driver - Methods > Close, get
		//Webdriver Close , get (Interface but no class defined)
		//Webdriver + Class Methods
		//Import chromedriver.exe
		//webdriver.chrome.driver->Value of the path
		System.out.print("Hello World\n");
		System.setProperty("webdriver.chrome.driver", "K:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:9001/LD/#/textbox");
		//Validate
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		
	}

}
