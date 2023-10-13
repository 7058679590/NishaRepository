package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		//it is pom class
		@FindBy(name ="username") private WebElement usnTB;
		@FindBy(id ="pwd" )private WebElement passTB;
		@FindBy(id = "loginButton") private WebElement loginButton;
		@FindBy(id = "KeepLoggedInCheckBox") private WebElement checkBox;
		@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
		@FindBy(id = "licenseLink") private WebElement licenseLink;
		
		
		//initialization
		public LoginPage(WebDriver driver) 
	     {
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		
	    public WebElement getUsnTB() {
			return usnTB;
		}


		public WebElement getPassTB() {
			return passTB;
		}


		public WebElement getLoginButton() {
			return loginButton;
		}


		public WebElement getCheckBox() {
			return checkBox;
		}


		public WebElement getActiMindLink() {
			return actiMindLink;
		}


		public WebElement getLicenseLink() 
		{
			return licenseLink;
		}

		//operational Methods
		public void validLogin(String validUsername,String validPassword) 
		{
			usnTB.sendKeys(validUsername);
			passTB.sendKeys(validPassword);
			loginButton.click();
		}
		
		public void invalidLogin(String invalidUsername,String invalidPassword)throws InterruptedException
		{
			usnTB.sendKeys(invalidUsername);
			passTB.sendKeys(invalidPassword);
			loginButton.click();
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
