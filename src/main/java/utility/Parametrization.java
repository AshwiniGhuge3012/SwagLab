package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;
import pom.SwagLabLoginPage;
public class Parametrization {
	
	public static String getExcelData(int row,int cell) throws IOException,EncryptedDocumentException{
	
	FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\SwagLab\\src\\test\\resources\\TestData.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
   return value;
}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = Browser.Launch("https://www.saucedemo.com/");
		
		String UserName = getExcelData(0,0);
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys(UserName);
		
		
		String Password = getExcelData(1,1);
		WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		password.sendKeys(Password);
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
	}
}