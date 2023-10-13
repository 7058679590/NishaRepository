package AssignmetPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {

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

		  //scroll till the pop up window link
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;
		  jse.executeScript("Open a popup window");
	     driver.findElement(By.partialLinkText("Open a popup window")).click();
		  
		  
		  
	}

}
