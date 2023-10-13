package dynamicScreenshot;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest {
  @Test
  public void LoginMethod()
  {
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(),"nisha");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("LoginButton")).click();
	  Reporter.log("Login Done!!",true);
	  sa.assertAll();
  }
  
  @Test(dependsOnMethods= "LoginMethod", alwaysRun =true)
  public void createUser() 
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("LoginButton")).click();
	  
	  
	  Reporter.log("created user!!",true);
  }
  
  @Test(dependsOnMethods= "create user", alwaysRun =true)
  public void  LogoutMethod()
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("LoginButton")).click();
	  
	  Reporter.log("LogOut Done!!",true);
  }
  {
	  
  }
}
