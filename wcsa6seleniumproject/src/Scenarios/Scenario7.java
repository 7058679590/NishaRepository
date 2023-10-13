package Scenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {
	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   //launch web application
	   driver.get("https://www.bluestone.com/?");
	   //handle popup
	   driver.findElement(By.xpath("//span[text()='Not now']")).click();
	   // move curser to All jewellery
	   WebElement target = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
	   Actions act= new Actions(driver);
	   act.moveToElement(target).perform();
	   //select kadas
	   driver.findElement(By.xpath("//span[text()='Kadas']")).click();
	   // click on any kada
	   WebElement kada = driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[2]"));
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].click()", kada);
	   String res = driver.getWindowHandle();
	   Set<String> alladd = driver.getWindowHandles();
	   for(String add:alladd)
	   {
		   if(!res.equals(add))
		   {
			   driver.switchTo().window(add);
		   }
	   }
	   // click on buy now
	   driver.findElement(By.id("buy-now")).click();
	   //error mess displayed or not
	   WebElement error = driver.findElement(By.className("formErrorContent"));
	   Thread.sleep(2000);
	    System.out.println(error.isDisplayed());
	      driver.quit();
			   
	   
		
	}

}
