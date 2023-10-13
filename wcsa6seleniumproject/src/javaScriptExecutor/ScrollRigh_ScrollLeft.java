package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRigh_ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		
		         // Launch the browser 
				 WebDriver driver =new ChromeDriver();
				 //maximize the browser
				 driver.manage().window().maximize();
				 //apply implicitly wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			        
				 //Launch the WeApplication
				 driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
				 
				 //perform explicit type casting 
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 Thread.sleep(3000);
				 
				 for(int i=0;i<=1;i++)
				 {
					
					 jse.executeScript("window.scrollBy(4000,0)"); 
				 }
				 
				 Thread.sleep(3000);
				 for(int i=0;i<=1;i++)
				 {
					
					 jse.executeScript("window.scrollBy(-4000,0)"); 
				 }
			
				 
				 //perform scroll right and scroll left 
				// jse.executeScript("window.scrollBy(4000,0)");
		        
				//perform scroll left
				 
		
		
		
		
		
		
		
		

	}

}
