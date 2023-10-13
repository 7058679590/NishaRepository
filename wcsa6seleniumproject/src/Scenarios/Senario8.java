package Scenarios;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario8 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch web application
		driver.get("https://www.bluestone.com/");
		//handle popup
		driver.findElement(By.id("denyBtn")).click();
		//mouseover to all jewellery
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		//select  kadas $ click on it
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		//select any kada
		WebElement kada = driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]"));
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
		 //click on bangle size
			driver.findElement(By.xpath("//span[text()=' Select Size ']")).click();
		//select bangle size
			WebElement selectsize = driver.findElement(By.className("size"));
			selectsize.click();
//		 click on buy now
   		driver.findElement(By.id("buy-now")).click();
			WebElement selectedsize = driver.findElement(By.xpath("//span[@class='size-box-overlay size-box-overlay_12493478']"));
			if(selectsize.equals(selectedsize))
			{
				System.out.println("Both are equals");
			}
			driver.quit();
	}

}
