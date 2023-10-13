package AssignmetPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActiTimexpath {

	public static void main(String[] args) throws InterruptedException {
		
          //Launch browser
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		//Launch web Application 
		driver.get("http://localhost/login.do");
		//identify username text box
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		//identify password text box
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		//enter time track
		driver.findElement(By.xpath("//a[text()= 'Enter Time-Track']")).click();
		Thread.sleep(3000);
		//Tasks
		driver.findElement(By.xpath("//div[text()='Tasks']/following-sibling::img")).click();
		Thread.sleep(2000);
		//Reports
		driver.findElement(By.xpath("//a[text()='Saved Reports']/following-sibling::img")).click();
		Thread.sleep(2000);
		//users
		driver.findElement(By.xpath("//div[text()='Users']/following-sibling::img")).click();
		Thread.sleep(3000);
		//work shedule
		driver.findElement(By.xpath("//div[text()='Work Schedule']/following-sibling::img")).click();
		Thread.sleep(2000);

		
	}
}
