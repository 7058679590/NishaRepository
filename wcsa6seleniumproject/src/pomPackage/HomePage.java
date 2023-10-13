package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//it is used  store all WebElement Of HomePage
	@FindBy(xpath = "//div[.='Time-Track']/ancestor::a ") private WebElement Time_Track_Module;
	@FindBy(xpath = "//div[.='Tasks']/ancestor::a")private WebElement Task_Module;
	@FindBy(xpath = "//div[.='Reports']/ancestor::a")private WebElement REport_Module;
	@FindBy(xpath = "//div[.='users']/ancestor::a")private WebElement users_Module;
	@FindBy(xpath = "//div[.='Work_schedule']/ancestor::a")private WebElement work_Schedule_Module;
	@FindBy(xpath = "//div[.='settings']/ancestor::a")private WebElement Settings_Module;
	@FindBy(partialLinkText = "Logout")private WebElement Logout_Link;
	
	//Initialization 
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getTime_Track_Module() {
		return Time_Track_Module;
	}

	public WebElement getTask_Module() {
		return Task_Module;
	}

	public WebElement getREport_Module() {
		return REport_Module;
	}

	public WebElement getUsers_Module() {
		return users_Module;
	}

	public WebElement getWork_Schedule_Module() {
		return work_Schedule_Module;
	}

	public WebElement getSettings_Module() {
		return Settings_Module;
	}

	public WebElement getLogout_Link() {
		return Logout_Link;
	}
	
	//operational method 
	public void Click_On_Time_Track_Module()
	{
		Time_Track_Module.click();
	}
	public void Click_on_Task_Module() 
	{
		Task_Module.click();
	}
	public void Click_On_REport_Module()
	{
		REport_Module.click();
	}
	public void Click_On_users__Module()
	{
		users_Module.click();
	}
	public void Click_On_work_Schedule_Module()
	{
		work_Schedule_Module.click();
	}
	public void Click_On_Settings_Module()
	{
		Settings_Module.click();
	}
	public void Click_On_Logout_Link()
	{
		Logout_Link.click();
	}
	
	
}
