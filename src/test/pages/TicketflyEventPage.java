package test.pages;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import patterns.PagePattern;

public class TicketflyEventPage extends PagePattern {
	private static String title = "Those Darlins - Tickets - Union Pool - Brooklyn, NY, October 12, 2013 | Ticketfly";

	public TicketflyEventPage(WebDriver driver) {
		super(driver, title);
	}
	
	public getTickets(){
		
	}
	
	
}

public TicketflyEventPage clickResult(){
	driver.findElement(By.xpath(".//*[@id='post-7']/div[3]/div/div[2]/div/ul/li[1]/div[3]/span/a")).click();
	return new TicketflyEventPage(driver);
}