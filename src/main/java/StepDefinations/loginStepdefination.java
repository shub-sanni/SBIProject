package StepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginPage;
import BaseP.BaseC;
import GenericMethodP.GenericMethodC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepdefination extends loginPage
{

	@Given("User should be login page")
	public static void User_should_be_login_page() throws IOException
	{
		browserInitzation(BaseC.browser,BaseC.URL);
		ExtentCucumberAdapter.addTestStepLog("application is launched");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenShot());
	}
	
	@When("user enters valid username {string}")
	public static void user_enters_valid_username(String username)
	{
		Enter_email(username,loginPage.EMailInput);
		ExtentCucumberAdapter.addTestStepLog("user successfully enetred the username  "+username);
	}
	
	@When("user enters valid password {string}")
	public static void user_enters_valid_password (String password)
	{
		Enter_password(password,loginPage.EMailpassword);
		ExtentCucumberAdapter.addTestStepLog("user successfully enetred the password  "+password);
	}
	
	@When("^user enters valid usernameM\"([^\"]*)\"$")
	public static void user_enters_valid_usernameM(String Emailid) throws IOException
 {
		Enter_email(Emailid,loginPage.EMailInput);
		ExtentCucumberAdapter.addTestStepLog("User is entered emailid"+Emailid);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenShot());
	}
	
	@When("^user enters valid passwordM\"([^\"]*)\"$")
	public static void user_enters_valid_passwordM(String password) throws IOException
	{
		Enter_password(password,loginPage.EMailpassword);
		ExtentCucumberAdapter.addTestStepLog("User is entered password"+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenShot());
	}
	
	
	
	@And("Clicks on submit")
	public static void Clicks_on_submit () throws IOException
	{
		Button_login();
		ExtentCucumberAdapter.addTestStepLog("login button is enable");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenShot());
		
	
	}
	@And("close the browser")
	public static void close_the_browser()
	{
		browser_Close();
	}
}





