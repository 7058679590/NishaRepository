package finalmock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		
		driver.findElement(By.id("alert1")).click();
				 
				 
		//handle the alert pop-up by switch to control to alert	 
	     driver.switchTo().alert().accept();
		    Thread.sleep(2000);
		    
		  

	}

}
