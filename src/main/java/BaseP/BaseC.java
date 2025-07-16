package BaseP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC {

	//browser inintaization
	//webdriver driver inintization
	//brwoser close
	//database connection
	public static String browser="chrome";
	public static String URL="https://fb.com";
	public static WebDriver driver;

	public static void browserInitzation(String browser,String URL)
	{
		switch(browser)
		{
		case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			 driver.get(URL);
			 break;
			 
		case "IE":
			 WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 break;	
		
		}
		
	}
		
	public static void browser_Close()
	{
		driver.close();
	}
	

}
