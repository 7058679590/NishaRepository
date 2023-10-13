package TestNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ActiTimeAssertion {
	
	static WebDriver driver;
  @Test
  public void LoginMethd() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://localhost/login.do");
	  
	  SoftAssert sa = new SoftAssert();
	  
	  sa.assertEquals(driver.getTitle(), "title");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("LoginButton")).click();
	  
	  String titleOfhp="actiTIME-Enter Time-Track";
	  Assert.assertEquals(driver.getTitle(), titleOfhp);  //hard asssert
	  WebElement logOut = driver.findElement(By.partialLinkText("Logout"));
	  
	  Assert.assertEquals(logOut.isDisplayed(),true); //
	  logOut .click();
	  
	  sa.assertAll();
	  
	  
	  
  }

}
