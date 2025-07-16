package Smoketestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Allpages.loginPage;
import BaseP.BaseC;

public class TC01_login extends loginPage {

	public static void main(String[] args) {
		
		
		browserInitzation(BaseC.browser,BaseC.URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement Buttonlogin=		driver.findElement(By.xpath("//button[@name='login']"));
		
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));

wait.until(ExpectedConditions.elementToBeClickable(Buttonlogin));
Buttonlogin.click();

		Enter_email("Testing@gmail.com",loginPage.EMailInput);
		Enter_password("P2332423",loginPage.EMailpassword);
		Button_login();
		browser_Close();

	}

}
