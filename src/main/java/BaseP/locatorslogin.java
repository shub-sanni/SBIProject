package BaseP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locatorslogin extends BaseC 
{

//to mention locators of webelements and generic resuable methods of that page(login page)
	
	public static By INputEmailid=By.id("email");
	public static By inputpassowrdid=By.name("pass");
	public static By Button_login=By.name("login");
	
	public static void EmailIn_input(String input,By INputEmailid )
	{
		driver.findElement(INputEmailid).sendKeys(input);
	}
	
public static void password_inpuT(String input,By inputpassowrdid)
{
	driver.findElement(inputpassowrdid).sendKeys(input);
}

public static void Login(By Button_login )
{
	driver.findElement(Button_login).click();
}
}
