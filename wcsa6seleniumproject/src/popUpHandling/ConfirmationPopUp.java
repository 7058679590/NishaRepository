package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/Nisha/Desktop/webElement/confirmation%20popup.html");
		  
		   // generate confirmation pop up
		   driver.findElement(By.xpath("//input[@type='submit'] ")).click();
		   
		 //handle the confirmation pop-up by switch to control to confirmation
		    Alert al = driver.switchTo().alert();
		    Thread.sleep(2000);
		    
		    //al.dismiss();
		    //al dismiss to dismiss the pop up 
		     System.out.println(al.getText());
		     al.accept();
		     Thread.sleep(3000); 


	}

}
