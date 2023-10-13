package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {

	 
	    //it is use to store all WebElement of Task Page
		@FindBy(xpath = "//a[text()='Projects& Customers']")private WebElement Projects_Customers_SubModule;
        @FindBy(xpath ="//input[@value='Create New Customer']") private WebElement Creat_new_Customer_Button;
        @FindBy(xpath ="//input[@value='Create New Project']") private WebElement Creat_new_Project_Button;
        @FindBy(name = "name")private WebElement Customer_name_TB;
        @FindBy(name = "CreatCistomerSubmit") private WebElement Creat_Customer_Button;
        @FindBy(xpath ="CreateCustomerSubmit") private WebElement Create_Customer_Button;
        @FindBy(name = " //select[@name='CustomerId']") private WebElement Customer_Dropdown;
        @FindBy(xpath ="//input[@name='name']") private WebElement Project_Name_TB;
        @FindBy(name = "CreatProjectSubmit")private WebElement Creat_Project_Button;
        
        //initialization
        public TaskPage(WebElement driver)
        {
        	PageFactory.initElements(driver,this);
        }

        //Utilization
		
		public WebElement getProjects_Customers_SubModule() {
			return Projects_Customers_SubModule;
		}

		public WebElement getCreat_new_Customer_Button() {
			return Creat_new_Customer_Button;
		}

		public WebElement getCreat_new_Project_Button() {
			return Creat_new_Project_Button;
		}

		public WebElement getCustomer_name_TB() {
			return Customer_name_TB;
		}

		public WebElement getCreat_Customer_Button() {
			return Creat_Customer_Button;
		}

		public WebElement getCreate_Customer_Button() {
			return Create_Customer_Button;
		}

		public WebElement getCustomer_Dropdown() {
			return Customer_Dropdown;
		}

		public WebElement getProject_Name_TB() {
			return Project_Name_TB;
		}

		public WebElement getCreat_Project_Button() {
			return Creat_Project_Button;
		}
		
		public void create_New_Customer_Method(String CustomerName)throws InterruptedException 
		{
			Thread.sleep(2000);
			Projects_Customers_SubModule.click();
			Creat_new_Customer_Button.click();
			Customer_name_TB.sendKeys(CustomerName);
			Creat_Customer_Button.click();
			
		}
		
		public void create_new_Project_Method(String customerName,String  projectName)throws InterruptedException
		{
			Thread.sleep(2000);
			Creat_new_Customer_Button.click();
			Select sel = new Select(Customer_Dropdown);
			sel.selectByVisibleText(customerName);
			Project_Name_TB.sendKeys(projectName);
			Creat_Project_Button.click();
			
		}

}
