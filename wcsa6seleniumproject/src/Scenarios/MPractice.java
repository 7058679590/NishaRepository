package Scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MPractice {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://localhost/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	 WebElement text = driver.findElement(By.xpath("//a[@class='item active']"));
	 if(text.isDisplayed())
	 {
	    System.out.println("It is correct");
	 }
	 else
	 {
		 System.out.println("It is not correct"); 
	 }


	}
	
}
