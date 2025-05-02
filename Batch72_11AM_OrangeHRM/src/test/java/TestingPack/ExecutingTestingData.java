package TestingPack;

import java.awt.AWTException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import BasePack.BaseClass;

public class ExecutingTestingData extends BaseClass{
    @Test
	public void Testcases() throws InterruptedException, AWTException, IOException 
	{
    	
		ScriptCoding S = new ScriptCoding();
		S.Login();
		//S.addoneemp();
		S.addoneexcel();
		//S.addmulexcel();
		//S.editing();
	}
	
	 
}
