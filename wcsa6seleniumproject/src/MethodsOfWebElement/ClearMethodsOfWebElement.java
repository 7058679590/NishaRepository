package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodsOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       //Launch the web application
		driver.get("http://localhost/login.do");
		
		//identify username textbox and pass the valid input
		driver.findElement(By.id("username")).sendKeys("admin");
		//identofy password textbox and pass the valid input
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify login button and click
		 WebElement loginbutton = driver.findElement(By.id("loginButton"));
		 loginbutton.click();
		Thread.sleep(2000);
		// identify username textbox and clear the inputs
		driver.findElement(By.name("username")).click();
		
		
		
	}
}
