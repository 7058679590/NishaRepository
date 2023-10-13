package AssignmetPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotandActions1 {

	public static void main(String[] args) throws AWTException {
		
		  // Launch the browser 
		    WebDriver driver =new ChromeDriver();
		 //maximize the browser
		 driver.manage().window().maximize();
		//apply implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			        
		//Launch the WeApplication
		driver.get("https://www.bluestone.com/");
				 
	   driver.findElement(By.id("denyBtn")).click();
	    WebElement watchjewellery = driver.findElement(By.xpath("//a[text()='Watch jewellery']"));
		
	    Actions act = new Actions(driver);
        act.moveToElement(watchjewellery).perform();
        
        driver.findElement(By.xpath("//a[.='Band']")).click();
        WebElement filterBy = driver.findElement(By.xpath("//span[@class='f-by']"));
        
        
        for(int i=1;i<=2;i++)
        {
        	act.doubleClick(filterBy).perform();
        	act.clickAndHold(filterBy).perform();
        }
        
        //copy the filter by text
        Robot robot = new Robot();
		
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
		
        
        driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		//pest the filter by text
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        driver.findElement(By.name("submit_search")).submit();
		
		
		
		
	}

}
