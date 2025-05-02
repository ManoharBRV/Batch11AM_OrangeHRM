package BasePack;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver ;
	public static Properties obj;
@BeforeClass
public void openbrowser() throws IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\ApiProject\\Batch72_11AM_OrangeHRM\\MyBrowser\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	FileInputStream FIS = new FileInputStream("C:\\ApiProject\\Batch72_11AM_OrangeHRM\\src\\data\\java\\MyData\\TestData");
	
	obj = new Properties();
	
	obj.load(FIS);
	
	//System.out.println(obj.getProperty("R"));
	
	
	
	
	
	

}

	 
  
  
  
  @AfterMethod
  public void closebrowser() {
	  
	 // driver.quit();
  }

 
}
