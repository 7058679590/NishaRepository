package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UniqueAttribute {
        public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new EdgeDriver();
	driver.get("http://localhost/login.do");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(3000);
	driver.close();
        	
        	
}
}
