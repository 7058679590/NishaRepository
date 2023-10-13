package AssignmetPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {

	           //how to close all browser
	
	public static void main(String[] args) throws InterruptedException {
		         //Launch the browser 
				 WebDriver driver =new ChromeDriver();
				 //maximize the browser
				 driver.manage().window().maximize();
				 //apply implicitly wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			        
				 //Launch the WeApplication
				 driver.get("http://omayo.blogspot.com/");
				  
				 
				 Thread.sleep(2000);
				  
				  // scroll till  open pop up window ink
				   WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
				  JavascriptExecutor jse =(JavascriptExecutor) driver;
				   jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
				   
				   //click on pop up window link
				       childBrowser.click();
				       
				       Thread.sleep(2000);
				       
				       //close the all window
				       driver.quit();
				  
				  

	}

}
