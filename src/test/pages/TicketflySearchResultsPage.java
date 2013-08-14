package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import patterns.PagePattern;

public class TicketflySearchResultsPage extends PagePattern {
	private static String title = "Search | Ticketfly";

	public TicketflySearchResultsPage(WebDriver driver) {
		super(driver, title);
	}
	
	public TicketflyEventPage clickResult(){
		driver.findElement(By.xpath(".//*[@id='post-7']/div[3]/div/div[2]/div/ul/li[1]/div[3]/span/a")).click();
		return new TicketflyEventPage(driver);
	}
	
}
