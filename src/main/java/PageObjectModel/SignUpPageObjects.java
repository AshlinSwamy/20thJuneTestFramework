package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects 
{
	public WebDriver driver;
	
	//we have acheieved encapsulation here
	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	private By CompanyEmployees=By.xpath("//select[@name='CompanyEmployees']");
	
	
	public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterUserFirstName() {
		
		return driver.findElement(firstName);
		
}
   public WebElement SelectJobTitle() {
		
		return driver.findElement(JobTitle);
}
   public WebElement SelectCompanyEmployee() {
		
		return driver.findElement(CompanyEmployees);
}
}