package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("file:///C:/Users/Nisha/Desktop/webElement/multiple%20selected%20dropdown.html");
		  
		  WebElement dropDownEle = driver.findElement(By.name("menu"));
		  Select sel = new Select(dropDownEle);
		  
		  //select single option from multiselect dropDown
		//  sel.selectByIndex(2);
		  
		  Thread.sleep(3000);
		  //Deselect single option from multiselect dropDown
		//  sel.deselectByIndex(0);
		  
		  //select multiple options 
	//	  for (int i = 0; i <=4; i++)
	//	  {
	//		Thread.sleep(3000);
	//		sel.selectByIndex(i);  
			  
	//	  }
		  
	//	  Thread.sleep(3000);
	//	  //deselect multiple options
	//	  for (int i = 0; i <=4; i++) 
	//	  {
	//		Thread.sleep(3000);
	//		sel.deselectByIndex(i);//deselect the option according to index
			  
	//	  }
		  
	   //select multiple option from dropdownBy using
		  //selectByvalue();
		
//		  String[] array= {"v1","v2","v3","v4","v5"};
		  
//		  for (int i = 0; i < array.length; i++)
//		  {
//			  Thread.sleep(2000);
//			  sel.selectByValue(array[i]);
			  
//		  }
		  
//		  Thread.sleep(4000);
		  //deselectByValue
//		  for (int i = 0; i < array.length; i++) 
//		  {
//			  Thread.sleep(2000);
//			  sel.deselectByValue(array[i]);
//		  }
		  
		//select the options from multiselect dropDown by using 
		  //selectByVisibletext()
		  sel.selectByVisibleText("loni dosa");
		  Thread.sleep(2000);
		 // sel.deselectByVisibleText("loni dosa");
		  sel.deselectAll();
		  
		  //select multiple options
		  for (int i = 0; i <=4; i++) 
		  {
			  Thread.sleep(2000);
			  sel.selectByIndex(i);
			  
		  }
		  Thread.sleep(2000);
		  sel.deselectAll();
		  	  
		

	}

}
