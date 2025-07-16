package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseP.BaseC;
import GenericMethodP.GenericMethodC;

public class loginPage extends BaseC
{

public static  By EMailInput=By.xpath("//input[@id='email']");
public static  By EMailpassword=By.xpath("//input[@id='pass']");
public static  By Buttonlogin=By.xpath("//button[@name='login']");

public static void Enter_email(String emailid,By EMailInput)
{
	driver.findElement(EMailInput).sendKeys(emailid);
}

public static void Enter_password(String passwordid,By EMailpassword)
{
	driver.findElement(EMailpassword).sendKeys(passwordid);
}

public static void Button_login()
{
	WebElement Ele=driver.findElement(Buttonlogin);
	GenericMethodC.Explictwait_clickable( Ele, 10);
	GenericMethodC.JavascriptExecutor_click(Ele);
}

}
