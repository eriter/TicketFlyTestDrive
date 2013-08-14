package test.pages;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import patterns.PagePattern;

public class GoogleSearchPage extends PagePattern{
	
	private static String title = "Google";
	
	public GoogleSearchPage(WebDriver driver){
		super(driver, title); 

	}
	
	public void searchFor(String searchText){
		driver.findElement(By.xpath("//*[@id='gbqfq']")).sendKeys(searchText);
	}
	
	public GoogleResultsPage submitForm(){
		driver.findElement(By.xpath(".//*[@id='gbqfba']")).submit();
		return new GoogleResultsPage(driver); 
	}
}