package AssignmetPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
	         WebDriver driver=new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("https://www.instagram.com");
	         Thread.sleep(3000);
	         driver.findElement(By.name("username")).sendKeys("isha@123");
	         driver.findElement(By.name("password")).sendKeys("dontKnow");
	         
	         driver.findElement(By.xpath("//button[contains(@class,'_acan_acap')]")).click();
	         
	}

}
