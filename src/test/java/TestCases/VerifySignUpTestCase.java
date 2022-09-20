package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LogInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignUpTestCase extends BaseClass{
	
	
	@Test
	public void SignUp() throws IOException, InterruptedException {

		
		LogInPageObjects lpo=new LogInPageObjects(driver);
		lpo.ClickOntryforFree().click();
		
		Thread.sleep(5000);
		
		String actualTitle=driver.getTitle();
		String expectedTitle="\"Free CRM Trial: Salesforce 30-Day Trial - Salesforce IN";
		
		CommonUtilities.handleAssertions(actualTitle, expectedTitle);
		
		System.out.println(driver.getTitle());
		
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		spo.EnterUserFirstName().sendKeys(TestCaseData.firstName);
		
		CommonUtilities.dropdownHandle(spo.SelectJobTitle(),1);
		CommonUtilities.dropdownHandle(spo.SelectCompanyEmployee(),2);
		
	
	}


}



