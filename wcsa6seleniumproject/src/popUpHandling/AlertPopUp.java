package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/Nisha/Desktop/webElement/alertpopup.html");

	   //generate alert pop up
	   WebElement button = driver.findElement(By.xpath("//button[text()='clickme!']"));
	   button.click();
	   
	   //handle the alert pop-up by switch to control to alert
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(2000);
	    
	    //al.dismiss();
	    //al dismiss to dismiss the pop up 
	     System.out.println(al.getText());
	     al.accept();
	     Thread.sleep(3000);
	    
	   
	   
}

}
