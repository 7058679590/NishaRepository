package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		         // Launch the browser 
				 WebDriver driver =new ChromeDriver();
				 //maximize the browser
				 driver.manage().window().maximize();
				 //apply implicitly wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			        
				 //Launch the WeApplication
				 driver.get("https://www.bluestone.com/");
				 
				 Thread.sleep(2000);
				//handle the pop up 
				 driver.findElement(By.id("denyBtn")).click();
				 //this chat box is design under the frame
				 //     handle frame first by identifying it 
				// driver.switchTo().frame(3);  //we handle frame by using index
				 
	                
				 //driver.switchTo().frame("fc_widget");......//we handle frame by using name of iframe
			
				 //we Handle using webElement 
				  WebElement chatBox = driver.findElement(By.id("chat-icon"));
				 chatBox.click();
		         
				 //switch control to main page
				 //driver.Switchto().defaultContent()
				 
				 //switch control to parent frame 
				 driver.findElement(By.id("chat_fc_name")).sendKeys("nisha");
				 driver.findElement(By.id("chat_fc_email")).sendKeys("nisha@123");
				 driver.findElement(By.id("chat_fc_password")).sendKeys("1234");
				 
	
		
		
		
		
		
	}

}
