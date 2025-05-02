package TestingPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReUsedMethods extends ExecutingTestingData{
	
	public WebElement xp(String w)
	{
		return driver.findElement(By.xpath(obj.getProperty(w)));
	}
	
	public void t(int u) throws InterruptedException
	{
		int z = 1000*u;
		Thread.sleep(z);
	}
	
	public void screensht(String d) throws IOException
	{
		File X = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Y = new File("C:\\ApiProject\\Batch72_11AM_OrangeHRM\\TestEvidences\\" + d +".jpg");
		FileHandler.copy(X, Y);
	}

}
