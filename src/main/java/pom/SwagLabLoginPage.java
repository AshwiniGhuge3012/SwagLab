package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	
	
	@FindBy (xpath = "//input[@placeholder='Username']") private WebElement userName;
	@FindBy (xpath = "//input[@placeholder='Password']") private WebElement passWord;
	@FindBy (xpath = "//input[@type='submit']") private WebElement login;

	

	public SwagLabLoginPage (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
		
		public void enterUsername(String name) {
			userName.sendKeys(name);
		}
		
		public void enterPassword(String pass) {
			passWord.sendKeys(pass);
		}
		
		public void clickOnLoginButton() {
			login.click();
		}
	}
	

