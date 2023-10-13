package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	      //static dropDown 
	
	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	 // driver.get("file:///C:/Users/Nisha/Desktop/webElement/singe%20selected%20dropdown.html");
	  
	   //handle dropDown by using select class
	   
	   //identify dropDown 
	   //single select 
	   //WebElement dropDownEle = driver.findElement(By.id("menu"));
	   
	   //create the obj of select class to access the methods 
		
		//Select sel = new Select(dropDownEle);
		//use selection methods 
		//Thread.sleep(2000);
		//sel.selectByIndex(1);//select option according to index value
		//Thread.sleep(3000);
		//sel.selectByVisibleText("pav bhaji");//selected option according to visible text
		//Thread.sleep(2000);
		//sel.selectByValue("v3");//select the option according to value
		
		//Launch the Multi select DropDown webPage
	   driver.navigate().to("file:///C:/Users/Nisha/Desktop/webElement/multiple%20selected%20dropdown.html");
	   
	   //identify DropDown
	   //Mutli select DropDown
	   WebElement dropDownEle1 = driver.findElement(By.id("menu"));
	   
	     Select sel = new Select(dropDownEle1);
	       // sel.selectByIndex();
	     
	     //select multiple options by using for loop
	    // for (int i = 0; i <=3; i++)
	    // {
	    //	Thread.sleep(2000); 
	    //	sel.selectByIndex(i);
	    	 
		// }
		
		//select multiple option from DropDown by using select by value
	     String []array= {"v1","v2","v3","v4","v5"};
	     
	     for (int i = 0; i < array.length; i++)
	    {
			Thread.sleep(2000);
			sel.selectByValue(array[i]);
	    	 
	    	 
		}
		
		
		
		
   }

}
