package patterns;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PagePattern {
	  
	  protected String url;	
	  protected WebDriver driver;
	  protected String title; 
	  
	  
	   
	  public PagePattern(WebDriver driver, String title) {
		  this.driver = driver; 
		  this.title = title; 
	  }
	  
	   
	  public boolean onPage(){
		  return (driver.getTitle().contains(title)); 
	  }
	  
	  public void open(){
		  driver.get(url); 
	  }
	  
	  public String getTitle() {
		  return title; 
	  }
	  
	  public String getURL() {
		return url;
	  }
	  
	  protected void sendText(String xpath, CharSequence[] text) {
			driver.findElement(By.xpath(xpath)).sendKeys(text);
	  }
	  
	  public boolean textPresent(String text){
		  return driver.getPageSource().contains(text); 
	  }
	  
	  public boolean elementPresent(By by) {
			try {
				driver.findElement(by); 
				return true;
			} catch (NoSuchElementException e) {
				return false;
			}
	  }

	  public boolean elementPresent(String xpath){
			try {
				driver.findElement(By.xpath(xpath));
				return true;
			} catch (NoSuchElementException e) {
				return false;
			}
	  }
	  
	 
	  public WebElement getWebElement(By by){
		  	return driver.findElement(by); 			
	  }
}