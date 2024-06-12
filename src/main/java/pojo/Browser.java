package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
		
		public static WebDriver Launch(String url) {
			 System.setProperty("WebDriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			 driver.get(url);
			 
			 driver.manage().window().maximize();
			return driver;
		}	
			public static void main (String[] args) {
		
		Browser.Launch("https://www.saucedemo.com/");
			
			
			
		}
	}



