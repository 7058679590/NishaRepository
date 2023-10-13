package AssignmetPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch webApplication 
		driver.get("https://www.netflix.com/in/");
		//identify email text box
				driver.findElement(By.id("ap_email")).sendKeys("nisha123");
				Thread.sleep(2000);
				//identify sign in button 
				driver.findElement(By.id("signinSubmit")).click();
				driver.close();

		

	}

}
