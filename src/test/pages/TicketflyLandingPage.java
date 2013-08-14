package test.pages;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import patterns.PagePattern;

public class TicketflyLandingPage extends PagePattern {
	private static String title = "Ticketfly | Buy Tickets";

	public TicketflyLandingPage(WebDriver driver) {
		super(driver, title);
	}
	
	public void searchFor(String searchText){
		driver.findElement(By.xpath(".//*[@id='q']")).sendKeys(searchText); 		
	}
	
	public TicketflySearchResultsPage submitForm(){
		driver.findElement(By.name("q")).submit();   
		return new TicketflySearchResultsPage(driver); 
	}
	
}
