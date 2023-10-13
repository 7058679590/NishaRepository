package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch WebApplication
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("isha@123");
		Thread.sleep(3000);

		
		
	}

}
