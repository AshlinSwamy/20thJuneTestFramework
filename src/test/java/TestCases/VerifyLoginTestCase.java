package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import PageObjectModel.LogInPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifyLoginTestCase extends BaseClass
{

	
	@Test
	public void login() throws IOException
	{
		
		
		LogInPageObjects lpo=new LogInPageObjects(driver);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickLoginButton().click();
		
		String expectedString="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		String actualString =driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		CommonUtilities.handleAssertions(actualString, expectedString);
		  
	}
}
