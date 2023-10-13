package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentandIndependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com");
     Thread.sleep(2000);
     //handle hidden division popup
     driver.findElement(By.xpath("//button[text()='✕']")).click();
     //identify search box
     driver.findElement(By.name("q")).sendKeys("mobiles");
     //identify search icon and click
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     Thread.sleep(2000);
     //identify 1st suggestion of mobile and print the price 
     System.out.println(driver.findElement(By.xpath("")));
		
	}

}
