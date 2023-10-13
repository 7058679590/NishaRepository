package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("http://omayo.blogspot.com");
         driver.findElement(By.partialLinkText("selenium tutorial")).click();
         Thread.sleep(2000);
         driver.close();
         
	}

}
