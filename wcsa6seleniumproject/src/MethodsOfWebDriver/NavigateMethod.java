package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch Chromebrowser 
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  //use navigate method and launch webApplication
		  driver.navigate().to("https;//wwww.google.com");
		  //use navigate perform Backward operation
		  Thread.sleep(2000);
		  driver.navigate().back();
		  //use navigate perform forward operation
		  driver.navigate().forward();
		  //use navigate perform refresh operation 
		  driver.navigate().refresh();
		  driver.close();
		  
	}

}
