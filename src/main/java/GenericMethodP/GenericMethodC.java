package GenericMethodP;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseP.BaseC;


public class GenericMethodC extends BaseC
{

	//dragndrop//select-4,ACTION-6,js-5,window-1,frames-6,alert-4,ckeck,radio,sendkeys....
	
	public static void JavascriptExecutor_click(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		  js.executeScript("arguments[0].click();", ele);
	}

	public static void Explictwait_clickable(WebElement ele, int timeout)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)BaseC.driver;
		//we are Takescreenshot as interface and converting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
			
		
		File destfile=new File("D://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
		
		
		return destfile.getAbsolutePath();
	}	
	
	
	
	
	
	
	
	
	
	
}
