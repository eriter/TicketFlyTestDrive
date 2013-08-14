package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import patterns.PagePattern;

public class GoogleResultsPage extends PagePattern{

  private static String title = "Google";

  public GoogleResultsPage(WebDriver driver) {
	  super(driver, title);
  }
  
  public TicketflyLandingPage clickResult(){
	  driver.findElement(By.xpath(".//*[@id='rso']/li[1]/div/h3/a")).click();
	  return new TicketflyLandingPage(driver);
  }
  
}