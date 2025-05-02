package TestingPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ScriptCoding extends ReUsedMethods{
	
	 public void Login() throws IOException  {
		  
		  driver.get(obj.getProperty("URL"));
		  
		  xp("XUN").sendKeys(obj.getProperty("UN"));
		  xp("XPWD").sendKeys(obj.getProperty("PWD"));
		  xp("XSUB").click();
		  screensht("AfterLogin");
		  
	  }
	 
	 public void addoneemp() throws InterruptedException, AWTException
	 {
		 
		 t(2);
		 
		 Actions A = new Actions(driver);
		 A.moveToElement(xp("XPIM")).perform();
		 t(1);
		 xp("XADD").click();
		 t(1);
		 driver.switchTo().frame(xp("XFRAME"));
		 xp("XID").clear();
		 t(1);
		 xp("XID").sendKeys("4488");
		 xp("XFIRST").sendKeys("Rose");
		 xp("XLAST").sendKeys("Lilly");
		 xp("XMID").sendKeys("Jsamine");
		 xp("XNICK").sendKeys("Sunflower");
		 t(1);
		 A.moveToElement(xp("XPHOTO")).click().perform();
		 t(1);
		 
		 StringSelection ss = new StringSelection("C:\\My Personal\\Batches\\Batch81_4PM\\Images\\STLC.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 t(2);
		 
		 Robot R = new Robot();
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		 t(1);
		 xp("XSAVE").click();
		 t(2);
		 xp("XBACK").click();
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 public void addoneexcel() throws IOException, InterruptedException, AWTException
	 {
		 FileInputStream fis = new FileInputStream("C:\\ApiProject\\Batch72_11AM_OrangeHRM\\src\\data\\java\\MyData\\OrangeHRMData11AM.xlsx");
	 
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 XSSFSheet sht = w.getSheet("CreateEmployee");
		 int eid = (int) sht.getRow(1).getCell(0).getNumericCellValue();
		 String efirst = sht.getRow(1).getCell(1).getStringCellValue();
		 String elast = sht.getRow(1).getCell(2).getStringCellValue();
		 String emid = sht.getRow(1).getCell(3).getStringCellValue();
		 String enick = sht.getRow(1).getCell(4).getStringCellValue();
		 
		 t(2);
		 
		 Actions A = new Actions(driver);
		 A.moveToElement(xp("XPIM")).perform();
		 t(1);
		 xp("XADD").click();
		 t(1);
		 driver.switchTo().frame(xp("XFRAME"));
		 xp("XID").clear();
		 t(1);
		 xp("XID").sendKeys(String.valueOf(eid));
		 xp("XFIRST").sendKeys(efirst);
		 xp("XLAST").sendKeys(elast);
		 xp("XMID").sendKeys(emid);
		 xp("XNICK").sendKeys(enick);
		 t(1);
		 A.moveToElement(xp("XPHOTO")).click().perform();
		 t(1);
		 
		 StringSelection ss = new StringSelection("C:\\My Personal\\Batches\\Batch10AM\\Images\\Arrays.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 t(2);
		 
		 Robot R = new Robot();
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		 t(1);
		 xp("XSAVE").click();
		 t(2);
		 xp("XBACK").click();
		 
		 
		 
	 }
	 
		 
	 public void addmulexcel() throws IOException, InterruptedException, AWTException
	 {
		 FileInputStream fis = new FileInputStream("C:\\ApiProject\\Batch72_11AM_OrangeHRM\\src\\data\\java\\MyData\\OrangeHRMData11AM.xlsx");
	 
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 XSSFSheet sht = w.getSheet("CreateEmployee");
		 
		 for(int x = 1 ; x<=sht.getLastRowNum(); x++)
		 {
		 int eid = (int) sht.getRow(x).getCell(0).getNumericCellValue();
		 String efirst = sht.getRow(x).getCell(1).getStringCellValue();
		 String elast = sht.getRow(x).getCell(2).getStringCellValue();
		 String emid = sht.getRow(x).getCell(3).getStringCellValue();
		 String enick = sht.getRow(x).getCell(4).getStringCellValue();
		 
		 t(2);
		 
		 Actions A = new Actions(driver);
		 A.moveToElement(xp("XPIM")).perform();
		 t(1);
		 xp("XADD").click();
		 t(1);
		 driver.switchTo().frame(xp("XFRAME"));
		 xp("XID").clear();
		 t(1);
		 xp("XID").sendKeys(String.valueOf(eid));
		 xp("XFIRST").sendKeys(efirst);
		 xp("XLAST").sendKeys(elast);
		 xp("XMID").sendKeys(emid);
		 xp("XNICK").sendKeys(enick);
		 t(1);
		 A.moveToElement(xp("XPHOTO")).click().perform();
		 t(1);
		 
		 StringSelection ss = new StringSelection("C:\\ApiProject\\Batch72_11AM_OrangeHRM\\EmpPhotos\\" +efirst +".jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 t(2);
		 
		 Robot R = new Robot();
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		 t(1);
		 screensht(efirst +"_Before Save");
		 xp("XSAVE").click();
		 
		 t(2);
		 screensht(efirst +"_After Save");
		 
		 xp("XBACK").click();
		 driver.switchTo().defaultContent();
		 t(1);
		 screensht(efirst +"_After Add");
		 
		 }  //for loop end
		 
	 }  //method end multiple emps
	 
	 public void editing() throws IOException, InterruptedException
	 {
		 
		 FileInputStream fis = new FileInputStream("C:\\ApiProject\\Batch72_11AM_OrangeHRM\\src\\data\\java\\MyData\\OrangeHRMData11AM.xlsx");
		 
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 XSSFSheet sht = w.getSheet("EditEmployee");
		
		
		 String elast = sht.getRow(2).getCell(1).getStringCellValue();
		 String elastnew = sht.getRow(2).getCell(4).getStringCellValue();
		 
		 
		 driver.switchTo().frame(xp("XFRAME"));
		 
		 driver.findElement(By.partialLinkText(elast)).click();
		 
		 t(2);
		 xp("XEDIT").click();
		 t(1);
		 xp("XLAST").clear();
		 t(1);
		 xp("XLAST").sendKeys(elastnew);
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 

}  //class end
