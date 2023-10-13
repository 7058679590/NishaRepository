package xpathLocator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
   Thread.sleep(2000);
   //xpath by using text function
   driver.findElement(By.xpath(" //button[text()=' Login ']")).click();
   Thread.sleep(3000);
    driver.findElement(By.xpath("//p[text()='Paul CollingsRamu']")).click();
    Thread.sleep(3000);
    driver.close();
		
	}

}
