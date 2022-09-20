package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjects 
{
	//this drover dont have scope
    public WebDriver driver;
	
    //we have achieved encapsulation here
	 private By username=By.xpath("//input[@id='username']");
	 private By password=By.xpath("//input[@id='password']");
	 private By LoginButton=By.xpath("//input[@id='Login']");
	 private By tryForFree=By.xpath("//a[@id='signup_link']");
	
	public LogInPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterUsername() {
		
		return driver.findElement(username);
		
	}
    public WebElement EnterPassword() {
		
		return driver.findElement(password);
		
    }
    public WebElement ClickLoginButton() {
	
	return driver.findElement(LoginButton);
	
}
    public WebElement  ClickOntryforFree() {
    	
    	return driver.findElement(tryForFree);
}
}