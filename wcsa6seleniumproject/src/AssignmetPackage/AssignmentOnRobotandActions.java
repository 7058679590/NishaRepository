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

public class AssignmentOnRobotandActions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 // Launch the browser 
		 WebDriver driver =new ChromeDriver();
		 //maximize the browser
		 driver.manage().window().maximize();
		 //apply implicitly wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
		 //Launch the WeApplication
		 driver.get("https://www.selenium.dev/");
		 
		 //identify getting started WebElement
		 WebElement gettingStarted = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		 //perform mouseHover getting started
         Actions act = new Actions(driver);
         act.moveToElement(gettingStarted).perform();
         
          //perform right click
         act.contextClick(gettingStarted).perform();
         
         //pass the control to inspect option
         
         //create object for robot class
          Robot robot = new Robot();
          
          for(int i=0;i<=10;i++)
          {
          Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
          
          }
		
          Thread.sleep(2000);
           //press the Enter key
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	
		
	}

}
