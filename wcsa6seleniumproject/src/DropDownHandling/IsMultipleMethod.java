package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		
		//System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//use to Launch single select dropdown 
		//driver.get("file:///C:/Users/Nisha/Desktop/webElement/singe%20selected%20dropdown.html");
		
		//use to launch multi select dropdown
		driver.get("file:///C:/Users/Nisha/Desktop/webElement/multiple%20selected%20dropdown.html");
		
		WebElement dropdownEle = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdownEle);
		
		//to check wether the dropdown is single selected or multi select
		System.out.println(sel.isMultiple());//for single select : false
		                                      //for multi select : true
		

		
		
		
		
		
		
		
		
		
	}

}
