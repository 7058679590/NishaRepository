package KeyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestcase extends BaseTest {

private static final String PROP_PATH = null;

public static void main(String[] args) throws IOException, InterruptedException {
		
		// to open & close the Browser 
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		// to read the validUsername & validPassword 
		Flib flib = new Flib();
		// identify username Text Box and pass username
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyDat(PROP_PATH,"Username"));
		// identify password Text Box and pass password
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyDat(PROP_PATH,"Password"));
		//identify loginButton and click
		driver.findElements(By.id("loginButton"));
		Thread.sleep(2000);
		bt.closeBrowser();
		
	}

}
