package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser 
		 WebDriver driver =new ChromeDriver();
		 //maximize the browser
		 driver.manage().window().maximize();
		 //apply implicitly wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
		 //Launch the WeApplication
		 driver.get("https://www.selenium.dev/");
		 
		 //perform explicit type casting 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 Thread.sleep(3000);
		 
		 //perform scroll down
		 jse.executeScript("window.scrollBy(0,-5000)");
		 
		 Thread.sleep(3000);
		 //perform scroll up
		  jse.executeScript("window.scrollBy(0,5000)");
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
