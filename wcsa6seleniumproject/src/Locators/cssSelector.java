package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// 
           WebDriver driver =new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.instagram.com/");
           Thread.sleep(3000);
           driver.findElement(By.cssSelector("input[aria-label*='Phone ']")).sendKeys("9876543210");
           Thread.sleep(2000);
           driver.findElement(By.cssSelector("input[name$='d ']")).sendKeys("1234");
           Thread.sleep(1000);
           driver.findElement(By.cssSelector("button[type^='s']")).click();
           
	}

} 
