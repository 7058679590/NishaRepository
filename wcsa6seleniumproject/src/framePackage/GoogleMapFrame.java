package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapFrame {

	public static void main(String[] args) throws InterruptedException {
		 // Launch the browser 
		 WebDriver driver =new ChromeDriver();
		 //maximize the browser
		 driver.manage().window().maximize();
		 //apply implicitly wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
		 //Launch the WeApplication
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(2000);
		 driver.switchTo().frame(1);
		 driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		 
		// driver.findElement(By.xpath(null))
		 driver.findElement(By.xpath("//span[text()='Maps']")).click();	
		 	


		
		
		
		
		
		
		
		
	}

}
