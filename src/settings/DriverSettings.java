package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Set yo driver here

public class DriverSettings {
	static WebDriver driver;
	
	public static WebDriver setDriver() {
		if ( driver == null ) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
}
