package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethodOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser 
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
		 //Launch the WeApplication
		 driver.get("https://www.shoppersstack.com");
		 Thread.sleep(2000);
		 //use click method of WebElement
		 driver.findElement(By.cssSelector("//img[alt='saree']")).click();
		 driver.close();
		 

		
		
		
	}

}
