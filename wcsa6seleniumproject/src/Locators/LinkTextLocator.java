package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         //Launch webApplication
         driver.get("http://omayo.blogspot.com");
         Thread.sleep(3000);
         
         driver.findElement(By.linkText("open a popup window")).click();
         Thread.sleep(2000);
         driver.close();
	}

}
