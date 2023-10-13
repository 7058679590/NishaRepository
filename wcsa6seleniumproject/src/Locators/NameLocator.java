package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	//on istagram 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("isha");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.close();
	}

}
