package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.Browser;

public class Screenshot {

	
public static void takeScreenshot(WebDriver driver,String name)throws IOException{
	
	

	
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	File Destination = new File("C:\\Users\\lenovo\\Documents\\Screenshot selenium\\"+name+".jpeg");
	
	FileHandler.copy(Source, Destination);
}
}
