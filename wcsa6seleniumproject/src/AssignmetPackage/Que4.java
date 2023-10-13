package AssignmetPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4 {

	        // how to close only child browser
	public static void main(String[] args) throws InterruptedException {
		
		     //Launch the browser 
		   WebDriver driver =new ChromeDriver();
		     //maximize the browser
		   driver.manage().window().maximize();
		    //apply implicitly wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
		     //Launch the WeApplication
		    driver.get("http://omayo.blogspot.com/");
		    //get the address of parent browser
		   String parentHandle = driver.getWindowHandle();
		   
		     Thread.sleep(2000);
		 
		    // scroll till  open pop up window ink
		   WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		  JavascriptExecutor jse =(JavascriptExecutor) driver;
		  jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
		   
		     // click on link
		     childBrowser.click();
		  
		  //get the address of parent browser 
		    Set<String> allHandle = driver.getWindowHandles();
		         
		         for (String wh : allHandle)
		         {
					  if (!parentHandle.equals(wh))
					  {
						// close only the child browser
						  Thread.sleep(3000);
						  driver.switchTo().window(wh).close();
					}
				}

	}

}
