package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		//xpath by using contains function
		driver.findElement(By.xpath("//p[@class='card-title fw-bold h6' and (text()='Java')]")).click();
		Thread.sleep(3000);
		
	}

}
