package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	//it is use to close parent and child browser
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//parent browser
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   //Launch the child Browser
		   driver.get("http://omayo.blogspot.com/");
		   Thread.sleep(2000);
		   //Launch child Browser
		   driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		  //use close method
		   driver.close();
		   
		   //use the quit() for close all browser.
		   driver.quit();
		    
	}

}
