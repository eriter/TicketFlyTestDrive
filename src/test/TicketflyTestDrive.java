package test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import test.pages.*;

public class TicketflyTestDrive {
	public static WebDriver driver;
	
	
	@Before
	public void SetUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
	}
	
	@After
	public void TearDown(){
		driver.quit();
	}
	
	@Test
	public void searchTicketfly() throws InterruptedException {
		GoogleSearchPage searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
		searchPage.searchFor("Ticketfly Inc");
		
		GoogleResultsPage resultsPage = PageFactory.initElements(driver, GoogleResultsPage.class);
		resultsPage.clickResult();
		
		TicketflyLandingPage landingPage = PageFactory.initElements(driver, TicketflyLandingPage.class);
		landingPage.searchFor("Those Darlins");
		landingPage.submitForm();
		
		TicketflySearchResultsPage tResultsPage = PageFactory.initElements(driver, TicketflySearchResultsPage.class);
		tResultsPage.clickResult();
		
		TicketflyEventPage eventPage = PageFactory.initElements(driver, TicketflyEventPage.class);
		eventPage.getTickets();
	}
}
