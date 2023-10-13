package TestNGExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchSql {
  @Test
  public void search_SQL_in_firefox() throws InterruptedException {
	    WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.google.com");
		 
		 
		 driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
		 Reporter.log("SQL",true);
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
	  
  }
}
