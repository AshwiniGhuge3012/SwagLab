package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;


public class SwagLabHomePage {
		
	@FindBy (xpath = "//span[text()='Products']")private WebElement title;	
	@FindBy (xpath = "//button[text()='Open Menu']")private WebElement menu;
	@FindBy (xpath = "//a[text()='Logout']")private WebElement 	Logout;
	@FindBy (xpath = "//div[@data-test='inventory-item']")private List< WebElement > Inventory;
	 
	
	
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public boolean isHomePageTitleDisplayed() {
		return title.isDisplayed();
	}
	
	public void clickonmenu() {
		menu.click();
	}
		
	public boolean isLogoutDisplayed() {
		 return Logout.isDisplayed();
	}
	
	public int getInventoryCount() {
		return Inventory.size();
	}
	
}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	